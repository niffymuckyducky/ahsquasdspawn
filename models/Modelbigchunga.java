public static class Modelbigchunga extends EntityModel {
	private final RendererModel bone;
	private final RendererModel Head;

	public Modelbigchunga() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new RendererModel(this);
		bone.setRotationPoint(-3.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 6, 4.0F, -11.0F, 3.0F, 1, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 16, 21, 2.0F, -6.0F, 0.0F, 3, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 6, 2.0F, -11.0F, 3.0F, 1, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 8, 3.0F, -6.0F, 2.0F, 1, 1, 1, 1.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 2.0F, -10.0F, 2.0F, 3, 4, 2, 6.0F, false));
		bone.cubeList.add(new ModelBox(bone, 38, 0, -2.0F, -1.0F, -9.0F, 3, 1, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 38, 6, 7.0F, -1.0F, -8.0F, 3, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 27, 37, -1.0F, -21.0F, -4.0F, 9, 4, 1, 0.0F, false));

		Head = new RendererModel(this);
		Head.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -6.0F, -25.0F, -3.0F, 13, 9, 12, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 36, 2.0F, -25.0F, -4.0F, 3, 4, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 16, 37, -4.0F, -25.0F, -4.0F, 3, 4, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 21, 2.0F, -34.0F, 0.0F, 5, 9, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 22, 22, -6.0F, -34.0F, 0.0F, 5, 9, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		Head.render(f5);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}