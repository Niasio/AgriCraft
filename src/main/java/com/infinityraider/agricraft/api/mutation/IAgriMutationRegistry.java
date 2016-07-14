/*
 */
package com.infinityraider.agricraft.api.mutation;

import java.util.List;
import javax.annotation.Nonnull;
import com.infinityraider.agricraft.api.plant.IAgriPlant;

/**
 * An interface for managing mutations.
 *
 * @author AgriCraft Team
 */
public interface IAgriMutationRegistry {

	/**
	 * Gets a list of all mutations currently registered Mutations are populated
	 * onServerAboutToStartEvent, so any calls before that will return null
	 */
	List<IAgriMutation> getMutations();

	/**
	 * Gets a list of all mutations that have this stack as a parent Mutations
	 * are populated onServerAboutToStartEvent, so any calls before that will
	 * return null
	 */
	List<IAgriMutation> getMutationsForParent(IAgriPlant parent);

	/**
	 * Gets a list of all mutations that have this stack as a child Mutations
	 * are populated onServerAboutToStartEvent, so any calls before that will
	 * return null
	 */
	List<IAgriMutation> getMutationsForChild(IAgriPlant child);

	/**
	 * Registers a new mutation: result = parent1 + parent2
	 *
	 * @param chance the chance of the mutation occurring as a normalized
	 * p-value.
	 * @param childId PlantID for the child plant;
	 * @param parentIds PlantIDs for the parent plants.
	 * @return True if successful
	 */
	boolean addMutation(double chance, @Nonnull String childId, @Nonnull String... parentIds);

	/**
	 * Removes all mutations that give this stack as a result
	 *
	 * @param result ItemStack containing the resulting seed for all the
	 * mutations to be removed
	 * @return True if successful
	 */
	boolean removeMutation(IAgriPlant result);

}
