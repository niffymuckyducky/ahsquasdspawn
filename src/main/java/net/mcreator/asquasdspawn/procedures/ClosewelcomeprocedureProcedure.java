package net.mcreator.asquasdspawn.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.asquasdspawn.AsquasdspawnElements;

@AsquasdspawnElements.ModElement.Tag
public class ClosewelcomeprocedureProcedure extends AsquasdspawnElements.ModElement {
	public ClosewelcomeprocedureProcedure(AsquasdspawnElements instance) {
		super(instance, 4);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Closewelcomeprocedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
