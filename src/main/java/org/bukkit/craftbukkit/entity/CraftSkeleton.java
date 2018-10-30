package org.bukkit.craftbukkit.entity;

import org.apache.commons.lang.Validate;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;

import net.minecraft.server.EntitySkeleton;

public class CraftSkeleton extends CraftMonster implements Skeleton {

	public CraftSkeleton(CraftServer server, EntitySkeleton entity) {
		super(server, entity);
	}

	@Override
	public EntitySkeleton getHandle() {
		return (EntitySkeleton) entity;
	}

	@Override
	public String toString() {
		return "CraftSkeleton";
	}

	@Override
	public EntityType getType() {
		return EntityType.SKELETON;
	}

	@Override
	@SuppressWarnings("deprecation")
	public SkeletonType getSkeletonType() {
		return SkeletonType.getType(getHandle().getSkeletonType());
	}

	@Override
	@SuppressWarnings("deprecation")
	public void setSkeletonType(SkeletonType type) {
		Validate.notNull(type);
		getHandle().setSkeletonType(type.getId());
	}
}
