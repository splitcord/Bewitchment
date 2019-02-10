package com.bewitchment.client.render.entity.model;

import com.bewitchment.common.entity.spirits.demons.EntityUran;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * uran - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelUran extends AdvancedModelBase {
	private static final int COIL_ANIMATION_LENGTH = 160;
	public AdvancedModelRenderer neck01a;
	public AdvancedModelRenderer neck01b;
	public AdvancedModelRenderer neck02;
	public AdvancedModelRenderer body01;
	public AdvancedModelRenderer neck03;
	public AdvancedModelRenderer neck04;
	public AdvancedModelRenderer neck05;
	public AdvancedModelRenderer head;
	public AdvancedModelRenderer tongue;
	public AdvancedModelRenderer upperJawM;
	public AdvancedModelRenderer upperJawL;
	public AdvancedModelRenderer upperJawR;
	public AdvancedModelRenderer lowerJaw;
	public AdvancedModelRenderer lHorn01a;
	public AdvancedModelRenderer rHorn01a;
	public AdvancedModelRenderer lHorn02a;
	public AdvancedModelRenderer rHorn02a;
	public AdvancedModelRenderer lFang;
	public AdvancedModelRenderer rFang;
	public AdvancedModelRenderer lHorn01b;
	public AdvancedModelRenderer lHorn01c;
	public AdvancedModelRenderer lHorn01d;
	public AdvancedModelRenderer lHorn01e;
	public AdvancedModelRenderer lHorn01f;
	public AdvancedModelRenderer rHorn01b;
	public AdvancedModelRenderer rHorn01c;
	public AdvancedModelRenderer rHorn01d;
	public AdvancedModelRenderer rHorn01e;
	public AdvancedModelRenderer rHorn01f;
	public AdvancedModelRenderer lHorn02b;
	public AdvancedModelRenderer lHorn02c;
	public AdvancedModelRenderer lHorn02d;
	public AdvancedModelRenderer lHorn02e;
	public AdvancedModelRenderer lHorn02b_1;
	public AdvancedModelRenderer rHorn02c;
	public AdvancedModelRenderer rHorn02d;
	public AdvancedModelRenderer rHorn02e;
	public AdvancedModelRenderer tail01;
	public AdvancedModelRenderer lWing01;
	public AdvancedModelRenderer rWing01;
	public AdvancedModelRenderer tail01b;
	public AdvancedModelRenderer tail02;
	public AdvancedModelRenderer tail03;
	public AdvancedModelRenderer tail03b;
	public AdvancedModelRenderer tail04;
	public AdvancedModelRenderer tail05;
	public AdvancedModelRenderer lWing02;
	public AdvancedModelRenderer lWing03;
	public AdvancedModelRenderer lWing04;
	public AdvancedModelRenderer rWing02;
	public AdvancedModelRenderer rWing03;
	public AdvancedModelRenderer rWing04;

	private ModelAnimator animator;

	public ModelUran() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.rHorn02d = new AdvancedModelRenderer(this, 52, 6);
		this.rHorn02d.mirror = true;
		this.rHorn02d.setRotationPoint(0.0F, -1.8F, 0.1F);
		this.rHorn02d.addBox(-0.5F, -0.7F, -0.5F, 1, 1, 1, 0.0F);
		this.setRotateAngle(rHorn02d, -0.3490658503988659F, 0.0F, 0.17453292519943295F);
		this.lHorn01e = new AdvancedModelRenderer(this, 47, 0);
		this.lHorn01e.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.lHorn01e.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn01e, -0.2617993877991494F, 0.0F, 0.0F);
		this.body01 = new AdvancedModelRenderer(this, 0, 31);
		this.body01.setRotationPoint(0.0F, 0.0F, 1.2F);
		this.body01.addBox(-2.5F, -1.8F, -0.4F, 5, 4, 8, 0.0F);
		this.lHorn01f = new AdvancedModelRenderer(this, 52, 0);
		this.lHorn01f.setRotationPoint(0.0F, -1.8F, 0.0F);
		this.lHorn01f.addBox(-0.5F, -2.7F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn01f, -0.2617993877991494F, 0.0F, 0.0F);
		this.rHorn01a = new AdvancedModelRenderer(this, 42, 0);
		this.rHorn01a.mirror = true;
		this.rHorn01a.setRotationPoint(-1.3F, -2.7F, -1.2F);
		this.rHorn01a.addBox(-0.3F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn01a, -0.8726646259971648F, -0.17453292519943295F, 0.0F);
		this.lWing01 = new AdvancedModelRenderer(this, 20, 9);
		this.lWing01.setRotationPoint(1.2F, -1.0F, 1.3F);
		this.lWing01.addBox(-0.5F, -3.0F, -1.0F, 1, 3, 2, 0.0F);
		this.setRotateAngle(lWing01, -0.6981317007977318F, 0.0F, 0.4363323129985824F);
		this.lHorn02d = new AdvancedModelRenderer(this, 52, 6);
		this.lHorn02d.mirror = true;
		this.lHorn02d.setRotationPoint(0.0F, -1.8F, 0.1F);
		this.lHorn02d.addBox(-0.5F, -0.7F, -0.5F, 1, 1, 1, 0.0F);
		this.setRotateAngle(lHorn02d, -0.3490658503988659F, 0.0F, -0.17453292519943295F);
		this.rHorn02a = new AdvancedModelRenderer(this, 42, 6);
		this.rHorn02a.setRotationPoint(-1.9F, -2.0F, -1.0F);
		this.rHorn02a.addBox(-0.6F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn02a, -1.3962634015954636F, -0.6108652381980153F, 0.0F);
		this.rHorn02e = new AdvancedModelRenderer(this, 57, 6);
		this.rHorn02e.setRotationPoint(0.0F, -0.6F, 0.0F);
		this.rHorn02e.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn02e, -0.4363323129985824F, 0.0F, 0.0F);
		this.tail05 = new AdvancedModelRenderer(this, 43, 54);
		this.tail05.setRotationPoint(0.0F, 0.5F, 7.8F);
		this.tail05.addBox(-0.5F, -0.5F, -0.6F, 1, 1, 8, 0.0F);
		this.lWing04 = new AdvancedModelRenderer(this, 28, 9);
		this.lWing04.setRotationPoint(0.0F, -3.4F, -0.1F);
		this.lWing04.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(lWing04, -0.9948376736367678F, 0.0F, 0.0F);
		this.tail01b = new AdvancedModelRenderer(this, 46, 18);
		this.tail01b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tail01b.addBox(-2.3F, -1.5F, 0.5F, 2, 3, 7, 0.0F);
		this.upperJawM = new AdvancedModelRenderer(this, 0, 0);
		this.upperJawM.setRotationPoint(0.0F, -1.0F, -2.8F);
		this.upperJawM.addBox(-1.5F, -1.1F, -4.4F, 3, 2, 5, 0.0F);
		this.setRotateAngle(upperJawM, 0.08726646259971647F, 0.0F, 0.0F);
		this.neck05 = new AdvancedModelRenderer(this, 0, 56);
		this.neck05.setRotationPoint(0.0F, 0.1F, -3.1F);
		this.neck05.addBox(-2.0F, -1.5F, -3.3F, 4, 3, 4, 0.0F);
		this.setRotateAngle(neck05, 0.5235987755982988F, 0.0F, 0.0F);
		this.neck03 = new AdvancedModelRenderer(this, 0, 56);
		this.neck03.setRotationPoint(0.0F, 0.0F, -3.6F);
		this.neck03.addBox(-2.0F, -1.8F, -3.0F, 4, 3, 4, 0.0F);
		this.setRotateAngle(neck03, -0.5235987755982988F, 0.0F, 0.0F);
		this.tail01 = new AdvancedModelRenderer(this, 27, 22);
		this.tail01.setRotationPoint(0.0F, 0.0F, 6.7F);
		this.tail01.addBox(-0.7F, -1.5F, 0.6F, 3, 3, 7, 0.0F);
		this.rHorn01e = new AdvancedModelRenderer(this, 47, 0);
		this.rHorn01e.mirror = true;
		this.rHorn01e.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rHorn01e.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn01e, -0.2617993877991494F, 0.0F, 0.0F);
		this.tail03b = new AdvancedModelRenderer(this, 22, 55);
		this.tail03b.setRotationPoint(0.0F, 0.5F, 0.0F);
		this.tail03b.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 7, 0.0F);
		this.rHorn01f = new AdvancedModelRenderer(this, 52, 0);
		this.rHorn01f.mirror = true;
		this.rHorn01f.setRotationPoint(0.0F, -1.8F, 0.0F);
		this.rHorn01f.addBox(-0.5F, -2.8F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn01f, -0.2617993877991494F, 0.0F, 0.0F);
		this.rWing02 = new AdvancedModelRenderer(this, 28, 9);
		this.rWing02.mirror = true;
		this.rWing02.setRotationPoint(0.0F, -2.6F, -0.1F);
		this.rWing02.addBox(-0.51F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rWing02, 0.5235987755982988F, 0.0F, 0.0F);
		this.lHorn02a = new AdvancedModelRenderer(this, 42, 6);
		this.lHorn02a.mirror = true;
		this.lHorn02a.setRotationPoint(1.9F, -2.0F, -1.0F);
		this.lHorn02a.addBox(-0.4F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn02a, -1.3962634015954636F, 0.6108652381980153F, 0.0F);
		this.rWing04 = new AdvancedModelRenderer(this, 28, 9);
		this.rWing04.mirror = true;
		this.rWing04.setRotationPoint(0.0F, -3.4F, -0.1F);
		this.rWing04.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(rWing04, -0.9948376736367678F, 0.0F, 0.0F);
		this.lowerJaw = new AdvancedModelRenderer(this, 0, 8);
		this.lowerJaw.setRotationPoint(0.0F, 0.5F, -2.0F);
		this.lowerJaw.addBox(-1.5F, -0.5F, -5.0F, 3, 1, 5, 0.0F);
		this.rHorn01c = new AdvancedModelRenderer(this, 42, 0);
		this.rHorn01c.mirror = true;
		this.rHorn01c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn01c.addBox(-0.3F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		this.neck01b = new AdvancedModelRenderer(this, 43, 28);
		this.neck01b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.neck01b.addBox(-2.3F, -1.49F, -3.5F, 2, 3, 5, 0.0F);
		this.lHorn02b = new AdvancedModelRenderer(this, 42, 6);
		this.lHorn02b.mirror = true;
		this.lHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02b.addBox(-0.4F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		this.lHorn02b_1 = new AdvancedModelRenderer(this, 42, 6);
		this.lHorn02b_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02b_1.addBox(-0.6F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		this.rHorn01d = new AdvancedModelRenderer(this, 42, 0);
		this.rHorn01d.mirror = true;
		this.rHorn01d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn01d.addBox(-0.7F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		this.rFang = new AdvancedModelRenderer(this, 0, 0);
		this.rFang.setRotationPoint(-1.4F, 0.5F, -3.6F);
		this.rFang.addBox(0.0F, -0.8F, -0.5F, 0, 2, 1, 0.0F);
		this.lHorn02c = new AdvancedModelRenderer(this, 47, 6);
		this.lHorn02c.mirror = true;
		this.lHorn02c.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.lHorn02c.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn02c, -0.3490658503988659F, 0.0F, -0.3490658503988659F);
		this.tail02 = new AdvancedModelRenderer(this, 0, 45);
		this.tail02.setRotationPoint(0.0F, 0.0F, 7.4F);
		this.tail02.addBox(-2.0F, -1.49F, -0.5F, 4, 3, 7, 0.0F);
		this.rHorn02c = new AdvancedModelRenderer(this, 47, 6);
		this.rHorn02c.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.rHorn02c.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn02c, -0.3490658503988659F, 0.0F, 0.3490658503988659F);
		this.lHorn01b = new AdvancedModelRenderer(this, 42, 0);
		this.lHorn01b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn01b.addBox(-0.7F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.lWing03 = new AdvancedModelRenderer(this, 28, 9);
		this.lWing03.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.lWing03.addBox(-0.5F, -3.8F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(lWing03, -0.6108652381980153F, 0.0F, 0.0F);
		this.rWing01 = new AdvancedModelRenderer(this, 20, 9);
		this.rWing01.mirror = true;
		this.rWing01.setRotationPoint(-1.2F, -1.0F, 1.3F);
		this.rWing01.addBox(-0.5F, -3.0F, -1.0F, 1, 3, 2, 0.0F);
		this.setRotateAngle(rWing01, -0.6981317007977318F, 0.0F, -0.4363323129985824F);
		this.head = new AdvancedModelRenderer(this, 0, 22);
		this.head.setRotationPoint(0.0F, -0.4F, -1.3F);
		this.head.addBox(-2.5F, -3.4F, -4.0F, 5, 4, 4, 0.0F);
		this.setRotateAngle(head, 1.0471975511965976F, 0.0F, 0.0F);
		this.lHorn02e = new AdvancedModelRenderer(this, 57, 6);
		this.lHorn02e.mirror = true;
		this.lHorn02e.setRotationPoint(0.0F, -0.6F, 0.0F);
		this.lHorn02e.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn02e, -0.4363323129985824F, 0.0F, 0.0F);
		this.rHorn01b = new AdvancedModelRenderer(this, 42, 0);
		this.rHorn01b.mirror = true;
		this.rHorn01b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn01b.addBox(-0.7F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.upperJawL = new AdvancedModelRenderer(this, 17, 0);
		this.upperJawL.setRotationPoint(0.9F, -0.7F, -3.0F);
		this.upperJawL.addBox(-0.5F, -1.0F, -3.5F, 2, 2, 3, 0.0F);
		this.setRotateAngle(upperJawL, 0.0F, 0.19198621771937624F, 0.0F);
		this.neck01a = new AdvancedModelRenderer(this, 27, 33);
		this.neck01a.setRotationPoint(0.0F, 22.5F, -3.9F);
		this.neck01a.addBox(-0.7F, -1.49F, -3.5F, 3, 3, 5, 0.0F);
		this.neck04 = new AdvancedModelRenderer(this, 0, 56);
		this.neck04.setRotationPoint(0.0F, -0.4F, -2.7F);
		this.neck04.addBox(-2.0F, -1.5F, -3.3F, 4, 3, 4, 0.0F);
		this.setRotateAngle(neck04, -0.6981317007977318F, 0.0F, 0.0F);
		this.rWing03 = new AdvancedModelRenderer(this, 28, 9);
		this.rWing03.mirror = true;
		this.rWing03.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.rWing03.addBox(-0.5F, -3.8F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(rWing03, -0.6108652381980153F, 0.0F, 0.0F);
		this.tail03 = new AdvancedModelRenderer(this, 23, 45);
		this.tail03.setRotationPoint(0.0F, 0.0F, 5.9F);
		this.tail03.addBox(-1.5F, -1.1F, -1.0F, 3, 2, 7, 0.0F);
		this.lHorn01a = new AdvancedModelRenderer(this, 42, 0);
		this.lHorn01a.setRotationPoint(1.3F, -2.7F, -1.2F);
		this.lHorn01a.addBox(-0.3F, -2.0F, -0.7F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn01a, -0.8726646259971648F, 0.17453292519943295F, 0.0F);
		this.upperJawR = new AdvancedModelRenderer(this, 17, 0);
		this.upperJawR.mirror = true;
		this.upperJawR.setRotationPoint(-1.9F, -0.7F, -3.0F);
		this.upperJawR.addBox(-0.5F, -1.0F, -3.87F, 2, 2, 3, 0.0F);
		this.setRotateAngle(upperJawR, 0.0F, -0.19198621771937624F, 0.0F);
		this.lHorn01d = new AdvancedModelRenderer(this, 42, 0);
		this.lHorn01d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn01d.addBox(-0.7F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		this.lFang = new AdvancedModelRenderer(this, 0, 0);
		this.lFang.setRotationPoint(1.4F, 0.5F, -3.6F);
		this.lFang.addBox(0.0F, -0.8F, -0.5F, 0, 2, 1, 0.0F);
		this.tail04 = new AdvancedModelRenderer(this, 41, 40);
		this.tail04.setRotationPoint(0.0F, 0.5F, 5.8F);
		this.tail04.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 9, 0.0F);
		this.neck02 = new AdvancedModelRenderer(this, 0, 56);
		this.neck02.setRotationPoint(0.0F, 0.0F, -3.6F);
		this.neck02.addBox(-2.0F, -1.5F, -3.3F, 4, 3, 4, 0.0F);
		this.setRotateAngle(neck02, -0.3490658503988659F, 0.0F, 0.0F);
		this.tongue = new AdvancedModelRenderer(this, 25, 0);
		this.tongue.setRotationPoint(0.0F, 0.3F, -1.9F);
		this.tongue.addBox(-1.5F, 0.0F, -5.0F, 3, 0, 7, 0.0F);
		this.lWing02 = new AdvancedModelRenderer(this, 28, 9);
		this.lWing02.setRotationPoint(0.0F, -2.6F, -0.1F);
		this.lWing02.addBox(-0.49F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lWing02, 0.5235987755982988F, 0.0F, 0.0F);
		this.lHorn01c = new AdvancedModelRenderer(this, 42, 0);
		this.lHorn01c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn01c.addBox(-0.3F, -2.0F, -0.3F, 1, 2, 1, 0.0F);
		this.rHorn02c.addChild(this.rHorn02d);
		this.lHorn01a.addChild(this.lHorn01e);
		this.neck01a.addChild(this.body01);
		this.lHorn01e.addChild(this.lHorn01f);
		this.head.addChild(this.rHorn01a);
		this.body01.addChild(this.lWing01);
		this.lHorn02c.addChild(this.lHorn02d);
		this.head.addChild(this.rHorn02a);
		this.rHorn02d.addChild(this.rHorn02e);
		this.tail04.addChild(this.tail05);
		this.lWing03.addChild(this.lWing04);
		this.tail01.addChild(this.tail01b);
		this.head.addChild(this.upperJawM);
		this.neck04.addChild(this.neck05);
		this.neck02.addChild(this.neck03);
		this.body01.addChild(this.tail01);
		this.rHorn01a.addChild(this.rHorn01e);
		this.tail03.addChild(this.tail03b);
		this.rHorn01e.addChild(this.rHorn01f);
		this.rWing01.addChild(this.rWing02);
		this.head.addChild(this.lHorn02a);
		this.rWing03.addChild(this.rWing04);
		this.head.addChild(this.lowerJaw);
		this.rHorn01a.addChild(this.rHorn01c);
		this.neck01a.addChild(this.neck01b);
		this.lHorn02a.addChild(this.lHorn02b);
		this.rHorn02a.addChild(this.lHorn02b_1);
		this.rHorn01a.addChild(this.rHorn01d);
		this.upperJawM.addChild(this.rFang);
		this.lHorn02a.addChild(this.lHorn02c);
		this.tail01.addChild(this.tail02);
		this.rHorn02a.addChild(this.rHorn02c);
		this.lHorn01a.addChild(this.lHorn01b);
		this.lWing02.addChild(this.lWing03);
		this.body01.addChild(this.rWing01);
		this.neck05.addChild(this.head);
		this.lHorn02d.addChild(this.lHorn02e);
		this.rHorn01a.addChild(this.rHorn01b);
		this.head.addChild(this.upperJawL);
		this.neck03.addChild(this.neck04);
		this.rWing02.addChild(this.rWing03);
		this.tail02.addChild(this.tail03);
		this.head.addChild(this.lHorn01a);
		this.head.addChild(this.upperJawR);
		this.lHorn01a.addChild(this.lHorn01d);
		this.upperJawM.addChild(this.lFang);
		this.tail03.addChild(this.tail04);
		this.neck01a.addChild(this.neck02);
		this.head.addChild(this.tongue);
		this.lWing01.addChild(this.lWing02);
		this.lHorn01a.addChild(this.lHorn01c);
		this.updateDefaultPose();
		animator = ModelAnimator.create();
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
		this.neck01a.render(f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.resetToDefaultPose();

		AdvancedModelRenderer[] TORSO = new AdvancedModelRenderer[]{neck01a, neck02, neck03, body01, tail01, tail02, tail03, tail04, tail05};

		//f = entity.ticksExisted;
		//f1 = 0.5f;

		float globalSpeed = 1;
		float globalHeight = 1;
		float globalDegree = 1;

		bob(head, 0.1f, 0.6f * globalHeight, false, f, f1);
		swing(neck01a, 0.1f, 0.6f * globalHeight, false, 0, 0, f, f1);
		swing(body01, 0.1f, 0.6f * globalHeight, false, 0, 0, f, f1);
		swing(tail01, 0.1f, 0.6f * globalHeight, false, 0, 0, f, f1);
		swing(tail02, 0.1f, 0.6f * globalHeight, false, 0, 0, f, f1);
		swing(tail03, 0.1f, 0.6f * globalHeight, false, 0, 0, f, f1);
		swing(tail04, 0.1f, 0.6f * globalHeight, false, 0, 0, f, f1);
		swing(tail05, 0.1f, 0.6f * globalHeight, false, 0, 0, f, f1);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.resetToDefaultPose();
		this.setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
		animator.update(entity);
		animator.setAnimation(EntityUran.ANIMATION_BITE);
		animator.startKeyframe(20);
		animator.move(neck05, 0.0f, 0.75f, 0.0f);
		animator.move(neck04, 0.0f, 0.55f, 0.0f);
		animator.move(head, 0.0f, 0.85f, 0.0f);
		animator.rotate(upperJawM, -0.45f, 0.0f, 0.0f);
		animator.rotate(lowerJaw, 0.45f, 0.0f, 0.0f);
		animator.endKeyframe();
		animator.resetKeyframe(10);
	}
}
