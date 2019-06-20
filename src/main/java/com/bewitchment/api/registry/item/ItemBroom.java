package com.bewitchment.api.registry.item;

import com.bewitchment.Bewitchment;
import com.bewitchment.common.entity.misc.EntityYewBroom;
import com.bewitchment.registry.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityEntry;

@SuppressWarnings("NullableProblems")
public class ItemBroom extends Item {
	private final EntityEntry entry;
	
	public ItemBroom(EntityEntry entry) {
		super();
		this.entry = entry;
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing face, float hitX, float hitY, float hitZ) {
		IBlockState state = world.getBlockState(pos);
		Block block = state.getBlock();
		if (Bewitchment.config.broomSweepables.contains(block.getTranslationKey())) {
			if (!world.isRemote) {
				block.dropBlockAsItem(world, pos, state, 0);
				world.setBlockToAir(pos);
				player.swingArm(hand);
				world.playSound(null, pos, ModSounds.BROOM_SWEEP, SoundCategory.BLOCKS, 0.8f, world.rand.nextFloat() * 0.4f + 0.8f);
			}
			else world.spawnParticle(EnumParticleTypes.SWEEP_ATTACK, pos.getX() + world.rand.nextDouble(), pos.getY() + 0.1, pos.getZ() + world.rand.nextDouble(), 0, 0, 0);
			return EnumActionResult.SUCCESS;
		}
		else if (entry != null) {
			Entity entity = entry.newInstance(world);
			entity.processInitialInteract(player, hand);
			if (!world.isRemote) {
				entity.setPositionAndUpdate(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5);
				if (entity instanceof EntityYewBroom) {
					EntityYewBroom broom = (EntityYewBroom) entity;
					broom.originalPos = pos.up();
					broom.originalDimension = world.provider.getDimension();
				}
				world.spawnEntity(entity);
			}
			return EnumActionResult.SUCCESS;
		}
		return super.onItemUse(player, world, pos, hand, face, hitX, hitY, hitZ);
	}
}