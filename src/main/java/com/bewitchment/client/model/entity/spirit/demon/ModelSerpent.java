package com.bewitchment.client.model.entity.spirit.demon;

import com.bewitchment.common.entity.spirit.demon.EntitySerpent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * serpent - cybercat5555
 * Created using Tabula 5.1.0
 */
@SuppressWarnings("WeakerAccess")
public class ModelSerpent extends ModelBase {
	public ModelRenderer body;
	public ModelRenderer tail00;
	public ModelRenderer leftWing00;
	public ModelRenderer rightWing00;
	public ModelRenderer neck00;
	public ModelRenderer tail00b;
	public ModelRenderer tail01;
	public ModelRenderer tail02;
	public ModelRenderer tail02b;
	public ModelRenderer tail03;
	public ModelRenderer tail04;
	public ModelRenderer leftWing0a;
	public ModelRenderer leftWing02;
	public ModelRenderer leftWing03;
	public ModelRenderer rightWing01;
	public ModelRenderer rightWing02;
	public ModelRenderer rightWing03;
	public ModelRenderer neck00b;
	public ModelRenderer neck01;
	public ModelRenderer neck02;
	public ModelRenderer neck03;
	public ModelRenderer head;
	public ModelRenderer tongue;
	public ModelRenderer upperJaw;
	public ModelRenderer lowerJaw;
	public ModelRenderer leftHornTop00a;
	public ModelRenderer rightHornTop00a;
	public ModelRenderer leftHorn00a;
	public ModelRenderer rightHorn00a;
	public ModelRenderer leftFang;
	public ModelRenderer rightFang;
	public ModelRenderer leftUpperJaw;
	public ModelRenderer rightUpperJaw;
	public ModelRenderer leftHornTop00b;
	public ModelRenderer leftHornTop01;
	public ModelRenderer leftHornTop02;
	public ModelRenderer rightHornTop00b;
	public ModelRenderer rightHornTop01;
	public ModelRenderer rightHornTop02;
	public ModelRenderer leftHorn00b;
	public ModelRenderer leftHorn01;
	public ModelRenderer leftHorn02;
	public ModelRenderer rightHorn00b;
	public ModelRenderer rightHorn01;
	public ModelRenderer rightHorn02;
	
	public ModelSerpent() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.lowerJaw = new ModelRenderer(this, 0, 8);
		this.lowerJaw.setRotationPoint(0.0F, 1.9F, -2.0F);
		this.lowerJaw.addBox(-1.5F, -0.5F, -5.0F, 3, 1, 5, 0.0F);
		this.leftWing00 = new ModelRenderer(this, 20, 9);
		this.leftWing00.setRotationPoint(1.2F, -1.0F, 1.3F);
		this.leftWing00.addBox(-0.5F, -3.0F, -1.0F, 1, 3, 2, 0.0F);
		this.setRotateAngle(leftWing00, -0.6981317007977318F, 0.0F, 0.4363323129985824F);
		this.leftWing0a = new ModelRenderer(this, 28, 9);
		this.leftWing0a.setRotationPoint(0.0F, -2.6F, -0.1F);
		this.leftWing0a.addBox(-0.49F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(leftWing0a, 0.5235987755982988F, 0.0F, 0.0F);
		this.leftHorn00a = new ModelRenderer(this, 42, 6);
		this.leftHorn00a.mirror = true;
		this.leftHorn00a.setRotationPoint(1.9F, -0.8F, -1.0F);
		this.leftHorn00a.addBox(-0.4F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(leftHorn00a, -1.2217304763960306F, 0.6108652381980153F, 0.0F);
		this.tail00b = new ModelRenderer(this, 46, 18);
		this.tail00b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tail00b.addBox(-2.3F, -1.5F, 0.5F, 2, 3, 7, 0.0F);
		this.tail04 = new ModelRenderer(this, 43, 54);
		this.tail04.setRotationPoint(0.0F, 0.5F, 7.8F);
		this.tail04.addBox(-0.5F, -0.5F, -0.6F, 1, 1, 8, 0.0F);
		this.leftWing03 = new ModelRenderer(this, 28, 9);
		this.leftWing03.setRotationPoint(0.0F, -3.4F, -0.1F);
		this.leftWing03.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(leftWing03, -0.9948376736367678F, 0.0F, 0.0F);
		this.tail03 = new ModelRenderer(this, 41, 40);
		this.tail03.setRotationPoint(0.0F, 0.5F, 5.8F);
		this.tail03.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 9, 0.0F);
		this.tail02b = new ModelRenderer(this, 22, 55);
		this.tail02b.setRotationPoint(0.0F, 0.5F, 0.0F);
		this.tail02b.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 7, 0.0F);
		this.rightWing03 = new ModelRenderer(this, 28, 9);
		this.rightWing03.mirror = true;
		this.rightWing03.setRotationPoint(0.0F, -3.4F, -0.1F);
		this.rightWing03.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(rightWing03, -0.9948376736367678F, 0.0F, 0.0F);
		this.leftHorn01 = new ModelRenderer(this, 47, 6);
		this.leftHorn01.mirror = true;
		this.leftHorn01.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.leftHorn01.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(leftHorn01, -0.3490658503988659F, 0.0F, -0.3490658503988659F);
		this.rightWing02 = new ModelRenderer(this, 28, 9);
		this.rightWing02.mirror = true;
		this.rightWing02.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.rightWing02.addBox(-0.5F, -3.8F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(rightWing02, -0.6108652381980153F, 0.0F, 0.0F);
		this.rightHornTop02 = new ModelRenderer(this, 52, 0);
		this.rightHornTop02.mirror = true;
		this.rightHornTop02.setRotationPoint(0.0F, -1.8F, 0.0F);
		this.rightHornTop02.addBox(-0.51F, -2.8F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rightHornTop02, -0.2617993877991494F, 0.0F, 0.0F);
		this.body = new ModelRenderer(this, 0, 31);
		this.body.setRotationPoint(0.0F, 22.5F, -3.4F);
		this.body.addBox(-2.5F, -1.8F, -0.4F, 5, 4, 8, 0.0F);
		this.leftHorn00b = new ModelRenderer(this, 42, 6);
		this.leftHorn00b.mirror = true;
		this.leftHorn00b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leftHorn00b.addBox(-0.4F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		this.leftFang = new ModelRenderer(this, 0, 0);
		this.leftFang.setRotationPoint(1.4F, 0.5F, -3.6F);
		this.leftFang.addBox(0.0F, -0.8F, -0.5F, 0, 2, 1, 0.0F);
		this.leftHornTop00b = new ModelRenderer(this, 42, 0);
		this.leftHornTop00b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.leftHornTop00b.addBox(-0.7F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.leftHornTop02 = new ModelRenderer(this, 52, 0);
		this.leftHornTop02.setRotationPoint(0.0F, -1.8F, 0.0F);
		this.leftHornTop02.addBox(-0.49F, -2.7F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(leftHornTop02, -0.2617993877991494F, 0.0F, 0.0F);
		this.rightHornTop01 = new ModelRenderer(this, 47, 0);
		this.rightHornTop01.mirror = true;
		this.rightHornTop01.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rightHornTop01.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rightHornTop01, -0.2617993877991494F, 0.0F, 0.0F);
		this.rightWing01 = new ModelRenderer(this, 28, 9);
		this.rightWing01.mirror = true;
		this.rightWing01.setRotationPoint(0.0F, -2.6F, -0.1F);
		this.rightWing01.addBox(-0.51F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rightWing01, 0.5235987755982988F, 0.0F, 0.0F);
		this.neck00b = new ModelRenderer(this, 43, 28);
		this.neck00b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.neck00b.addBox(-2.3F, -1.49F, -5.0F, 2, 3, 5, 0.0F);
		this.neck01 = new ModelRenderer(this, 0, 56);
		this.neck01.setRotationPoint(0.0F, 0.0F, -4.9F);
		this.neck01.addBox(-2.0F, -1.5F, -4.0F, 4, 3, 4, 0.0F);
		this.head = new ModelRenderer(this, 0, 22);
		this.head.setRotationPoint(0.0F, -0.3F, -3.8F);
		this.head.addBox(-2.5F, -2.0F, -4.0F, 5, 4, 4, 0.0F);
		this.neck02 = new ModelRenderer(this, 0, 56);
		this.neck02.setRotationPoint(0.0F, 0.0F, -3.9F);
		this.neck02.addBox(-2.0F, -1.5F, -4.0F, 4, 3, 4, 0.0F);
		this.rightHorn01 = new ModelRenderer(this, 47, 6);
		this.rightHorn01.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.rightHorn01.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rightHorn01, -0.3490658503988659F, 0.0F, 0.3490658503988659F);
		this.upperJaw = new ModelRenderer(this, 0, 0);
		this.upperJaw.setRotationPoint(0.0F, 0.3F, -2.8F);
		this.upperJaw.addBox(-1.5F, -1.1F, -4.4F, 3, 2, 5, 0.0F);
		this.setRotateAngle(upperJaw, 0.08726646259971647F, 0.0F, 0.0F);
		this.rightHornTop00a = new ModelRenderer(this, 42, 0);
		this.rightHornTop00a.mirror = true;
		this.rightHornTop00a.setRotationPoint(-1.3F, -1.5F, -1.2F);
		this.rightHornTop00a.addBox(-0.3F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rightHornTop00a, -0.8726646259971648F, -0.17453292519943295F, 0.0F);
		this.tail00 = new ModelRenderer(this, 27, 22);
		this.tail00.setRotationPoint(0.0F, 0.0F, 6.7F);
		this.tail00.addBox(-0.7F, -1.5F, 0.6F, 3, 3, 7, 0.0F);
		this.leftHorn02 = new ModelRenderer(this, 47, 6);
		this.leftHorn02.mirror = true;
		this.leftHorn02.setRotationPoint(0.0F, -1.8F, 0.0F);
		this.leftHorn02.addBox(-0.49F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(leftHorn02, -0.3490658503988659F, 0.0F, 0.0F);
		this.tail01 = new ModelRenderer(this, 0, 45);
		this.tail01.setRotationPoint(0.0F, 0.0F, 7.4F);
		this.tail01.addBox(-2.0F, -1.49F, -0.5F, 4, 3, 7, 0.0F);
		this.tail02 = new ModelRenderer(this, 23, 45);
		this.tail02.setRotationPoint(0.0F, 0.0F, 5.9F);
		this.tail02.addBox(-1.5F, -1.1F, -1.0F, 3, 2, 7, 0.0F);
		this.leftUpperJaw = new ModelRenderer(this, 17, 0);
		this.leftUpperJaw.setRotationPoint(0.9F, 0.1F, 0.0F);
		this.leftUpperJaw.addBox(-0.5F, -1.0F, -3.5F, 2, 2, 3, 0.0F);
		this.setRotateAngle(leftUpperJaw, 0.0F, 0.19198621771937624F, 0.0F);
		this.neck00 = new ModelRenderer(this, 27, 33);
		this.neck00.setRotationPoint(0.0F, 0.0F, -0.2F);
		this.neck00.addBox(-0.7F, -1.49F, -5.0F, 3, 3, 5, 0.0F);
		this.tongue = new ModelRenderer(this, 25, 0);
		this.tongue.setRotationPoint(0.0F, 1.4F, -1.9F);
		this.tongue.addBox(-1.5F, 0.0F, -5.0F, 3, 0, 7, 0.0F);
		this.rightHornTop00b = new ModelRenderer(this, 42, 0);
		this.rightHornTop00b.mirror = true;
		this.rightHornTop00b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rightHornTop00b.addBox(-0.7F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.rightHorn02 = new ModelRenderer(this, 47, 6);
		this.rightHorn02.setRotationPoint(0.0F, -1.8F, 0.0F);
		this.rightHorn02.addBox(-0.51F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rightHorn02, -0.3490658503988659F, 0.0F, 0.0F);
		this.leftHornTop00a = new ModelRenderer(this, 42, 0);
		this.leftHornTop00a.setRotationPoint(1.3F, -1.5F, -1.2F);
		this.leftHornTop00a.addBox(-0.3F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(leftHornTop00a, -0.8726646259971648F, 0.17453292519943295F, 0.0F);
		this.rightHorn00b = new ModelRenderer(this, 42, 6);
		this.rightHorn00b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rightHorn00b.addBox(-0.6F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		this.leftWing02 = new ModelRenderer(this, 28, 9);
		this.leftWing02.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.leftWing02.addBox(-0.5F, -3.8F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(leftWing02, -0.6108652381980153F, 0.0F, 0.0F);
		this.rightFang = new ModelRenderer(this, 0, 0);
		this.rightFang.setRotationPoint(-1.4F, 0.5F, -3.6F);
		this.rightFang.addBox(0.0F, -0.8F, -0.5F, 0, 2, 1, 0.0F);
		this.rightWing00 = new ModelRenderer(this, 20, 9);
		this.rightWing00.mirror = true;
		this.rightWing00.setRotationPoint(-1.2F, -1.0F, 1.3F);
		this.rightWing00.addBox(-0.5F, -3.0F, -1.0F, 1, 3, 2, 0.0F);
		this.setRotateAngle(rightWing00, -0.6981317007977318F, 0.0F, -0.4363323129985824F);
		this.neck03 = new ModelRenderer(this, 0, 56);
		this.neck03.setRotationPoint(0.0F, 0.0F, -3.9F);
		this.neck03.addBox(-2.0F, -1.5F, -4.0F, 4, 3, 4, 0.0F);
		this.rightUpperJaw = new ModelRenderer(this, 17, 0);
		this.rightUpperJaw.mirror = true;
		this.rightUpperJaw.setRotationPoint(-1.9F, 0.1F, 0.0F);
		this.rightUpperJaw.addBox(-0.5F, -1.0F, -3.87F, 2, 2, 3, 0.0F);
		this.setRotateAngle(rightUpperJaw, 0.0F, -0.19198621771937624F, 0.0F);
		this.leftHornTop01 = new ModelRenderer(this, 47, 0);
		this.leftHornTop01.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.leftHornTop01.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(leftHornTop01, -0.2617993877991494F, 0.0F, 0.0F);
		this.rightHorn00a = new ModelRenderer(this, 42, 6);
		this.rightHorn00a.setRotationPoint(-1.9F, -0.8F, -1.0F);
		this.rightHorn00a.addBox(-0.6F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rightHorn00a, -1.2217304763960306F, -0.6108652381980153F, 0.0F);
		this.head.addChild(this.lowerJaw);
		this.body.addChild(this.leftWing00);
		this.leftWing00.addChild(this.leftWing0a);
		this.head.addChild(this.leftHorn00a);
		this.tail00.addChild(this.tail00b);
		this.tail03.addChild(this.tail04);
		this.leftWing02.addChild(this.leftWing03);
		this.tail02.addChild(this.tail03);
		this.tail02.addChild(this.tail02b);
		this.rightWing02.addChild(this.rightWing03);
		this.leftHorn00a.addChild(this.leftHorn01);
		this.rightWing01.addChild(this.rightWing02);
		this.rightHornTop01.addChild(this.rightHornTop02);
		this.leftHorn00a.addChild(this.leftHorn00b);
		this.upperJaw.addChild(this.leftFang);
		this.leftHornTop00a.addChild(this.leftHornTop00b);
		this.leftHornTop01.addChild(this.leftHornTop02);
		this.rightHornTop00a.addChild(this.rightHornTop01);
		this.rightWing00.addChild(this.rightWing01);
		this.neck00.addChild(this.neck00b);
		this.neck00.addChild(this.neck01);
		this.neck03.addChild(this.head);
		this.neck01.addChild(this.neck02);
		this.rightHorn00a.addChild(this.rightHorn01);
		this.head.addChild(this.upperJaw);
		this.head.addChild(this.rightHornTop00a);
		this.body.addChild(this.tail00);
		this.leftHorn01.addChild(this.leftHorn02);
		this.tail00.addChild(this.tail01);
		this.tail01.addChild(this.tail02);
		this.upperJaw.addChild(this.leftUpperJaw);
		this.body.addChild(this.neck00);
		this.head.addChild(this.tongue);
		this.rightHornTop00a.addChild(this.rightHornTop00b);
		this.rightHorn01.addChild(this.rightHorn02);
		this.head.addChild(this.leftHornTop00a);
		this.rightHorn00a.addChild(this.rightHorn00b);
		this.leftWing0a.addChild(this.leftWing02);
		this.upperJaw.addChild(this.rightFang);
		this.body.addChild(this.rightWing00);
		this.neck02.addChild(this.neck03);
		this.upperJaw.addChild(this.rightUpperJaw);
		this.leftHornTop00a.addChild(this.leftHornTop01);
		this.head.addChild(this.rightHorn00a);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.body.render(f5);
	}
	
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
		EntitySerpent serpent = (EntitySerpent) entity;
		
		float time = ((entity.ticksExisted + Minecraft.getMinecraft().getRenderPartialTicks()) * 0.4F);
		float angle = (float) (0.40F * ((serpent.motionX + serpent.motionZ) * 50));
		this.neck00.rotateAngleY = (float) (Math.toRadians(15) + angle * MathHelper.sin(time - 1));
		this.neck01.rotateAngleY = (float) (Math.toRadians(-15) + angle * MathHelper.sin(time + 1));
		//this line could possibly be pulled
		this.neck02.rotateAngleY = (float) (Math.toRadians(-15) + angle * MathHelper.sin(time + 1));
		this.neck00.rotateAngleX = (float) Math.toRadians(headPitch);
		this.neck01.rotateAngleX = 0F;
		//this line could possibly be pulled
		this.neck02.rotateAngleX = 0F;
		this.body.rotateAngleY = (float) (angle * MathHelper.sin(time + 10) + Math.toRadians(netHeadYaw));
		this.tail00.rotateAngleY = (float) (Math.toRadians(15) + angle * MathHelper.sin(time + 0));
		this.tail01.rotateAngleY = (float) (Math.toRadians(15) + angle * MathHelper.sin(time + 2));
		this.tail02.rotateAngleY = (float) (Math.toRadians(-30) + angle * MathHelper.sin(time + 3));
		this.tail03.rotateAngleY = (float) (Math.toRadians(-15) + angle * MathHelper.sin(time + 1));
		this.tail04.rotateAngleY = (float) (Math.toRadians(40) + angle * MathHelper.sin(time - 0));
	}
	
	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}