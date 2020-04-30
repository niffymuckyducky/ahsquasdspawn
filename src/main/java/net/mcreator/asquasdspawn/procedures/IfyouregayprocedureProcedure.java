package net.mcreator.asquasdspawn.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.server.MinecraftServer;

import net.mcreator.asquasdspawn.AsquasdspawnElements;

@AsquasdspawnElements.ModElement.Tag
public class IfyouregayprocedureProcedure extends AsquasdspawnElements.ModElement {
	public IfyouregayprocedureProcedure(AsquasdspawnElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new StringTextComponent("Someone pressed the gay button that means they are gay!"));
		}
	}
}
