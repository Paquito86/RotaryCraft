/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 13/06/2013 11:18:12 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.List;

import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelMirror extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape5a;
	ModelRenderer Shape5b;
	ModelRenderer Shape5c;
	ModelRenderer Shape5d;
	ModelRenderer Shape3a;
	ModelRenderer Shape3b;
	ModelRenderer Shape3c;
	ModelRenderer Shape3d;
	ModelRenderer Shape3as;
	ModelRenderer Shape5af;
	ModelRenderer Shape5as;

	public ModelMirror()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 0, 71);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 0);
		Shape3.addBox(-5F, 0F, -5F, 10, 1, 10);
		Shape3.setRotationPoint(0F, 22F, 0F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0.5235988F, 0F);
		Shape4 = new ModelRenderer(this, 0, 19);
		Shape4.addBox(-1F, -4.1F, -4F, 2, 9, 1);
		Shape4.setRotationPoint(0F, 23F, 0F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, -1.047198F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 66, 0);
		Shape5.addBox(-8F, 6.1F, 5.3F, 16, 3, 1);
		Shape5.setRotationPoint(0F, 9F, 0F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, -0.7853982F, 0F, 0F);
		Shape5a = new ModelRenderer(this, 0, 57);
		Shape5a.addBox(4F, 3F, 1.5F, 2, 11, 1);
		Shape5a.setRotationPoint(0F, 9F, 0F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape5b = new ModelRenderer(this, 66, 11);
		Shape5b.addBox(-8F, 3F, 2.1F, 16, 3, 1);
		Shape5b.setRotationPoint(0F, 9F, 0F);
		Shape5b.setTextureSize(128, 128);
		Shape5b.mirror = true;
		this.setRotation(Shape5b, -0.2617994F, 0F, 0F);
		Shape5c = new ModelRenderer(this, 66, 5);
		Shape5c.addBox(-8F, 4.7F, 3.5F, 16, 3, 1);
		Shape5c.setRotationPoint(0F, 9F, 0F);
		Shape5c.setTextureSize(128, 128);
		Shape5c.mirror = true;
		this.setRotation(Shape5c, -0.5235988F, 0F, 0F);
		Shape5d = new ModelRenderer(this, 66, 17);
		Shape5d.addBox(-8F, 0.6F, 1.3F, 16, 3, 1);
		Shape5d.setRotationPoint(0F, 9F, 0F);
		Shape5d.setTextureSize(128, 128);
		Shape5d.mirror = true;
		this.setRotation(Shape5d, 0F, 0F, 0F);
		Shape3a = new ModelRenderer(this, 0, 0);
		Shape3a.addBox(-5F, 0F, -5F, 10, 1, 10);
		Shape3a.setRotationPoint(0F, 22F, 0F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape3b = new ModelRenderer(this, 0, 0);
		Shape3b.addBox(-5F, 0F, -5F, 10, 1, 10);
		Shape3b.setRotationPoint(0F, 22F, 0F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 1.047198F, 0F);
		Shape3c = new ModelRenderer(this, 0, 0);
		Shape3c.addBox(-5F, 0F, -5F, 10, 1, 10);
		Shape3c.setRotationPoint(0F, 22F, 0F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0.7853982F, 0F);
		Shape3d = new ModelRenderer(this, 0, 0);
		Shape3d.addBox(-5F, 0F, -5F, 10, 1, 10);
		Shape3d.setRotationPoint(0F, 22F, 0F);
		Shape3d.setTextureSize(128, 128);
		Shape3d.mirror = true;
		this.setRotation(Shape3d, 0F, 1.308997F, 0F);
		Shape3as = new ModelRenderer(this, 0, 0);
		Shape3as.addBox(-5F, 0F, -5F, 10, 1, 10);
		Shape3as.setRotationPoint(0F, 22F, 0F);
		Shape3as.setTextureSize(128, 128);
		Shape3as.mirror = true;
		this.setRotation(Shape3as, 0F, 0.2617994F, 0F);
		Shape5af = new ModelRenderer(this, 0, 31);
		Shape5af.addBox(-6F, 3F, 1.5F, 2, 11, 1);
		Shape5af.setRotationPoint(0F, 9F, 0F);
		Shape5af.setTextureSize(128, 128);
		Shape5af.mirror = true;
		this.setRotation(Shape5af, 0F, 0F, 0F);
		Shape5as = new ModelRenderer(this, 0, 44);
		Shape5as.addBox(-1F, 3F, 1.5F, 2, 11, 1);
		Shape5as.setRotationPoint(0F, 9F, 0F);
		Shape5as.setTextureSize(128, 128);
		Shape5as.mirror = true;
		this.setRotation(Shape5as, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(List li, float phi)
	{
		Shape1.render(f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 0, 1, 0);
		GL11.glTranslated(0, -1, 0);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape5a.render(f5);
		Shape5b.render(f5);
		Shape5c.render(f5);
		Shape5d.render(f5);
		Shape3a.render(f5);
		Shape3b.render(f5);
		Shape3c.render(f5);
		Shape3d.render(f5);
		Shape3as.render(f5);
		Shape5af.render(f5);
		Shape5as.render(f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 0, 1, 0);
		GL11.glTranslated(0, -1, 0);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

	public void renderAll(List li, float phi, float theta)
	{
		this.renderAll(li, phi);
	}

}
