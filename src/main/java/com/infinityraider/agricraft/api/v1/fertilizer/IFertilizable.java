/*
 */
package com.infinityraider.agricraft.api.v1.fertilizer;

import java.util.Random;

/**
 * An interface for fertilizable things.
 *
 * @author RlonRyan
 */
public interface IFertilizable {

	/**
	 * Checks if a certain fertilizer may be applied to this crop
	 *
	 * @param fertilizer the fertilizer to be checked
	 * @return if the fertilizer may be applied
	 */
	boolean acceptsFertilizer(IAgriFertilizer fertilizer);

	/**
	 * Apply fertilizer to this crop.
	 *
	 * @param fertilizer the fertilizer to be applied.
	 * @param rand the random number generator to be used.
	 * @return if the fertilizer was successfully applied.
	 */
	boolean onApplyFertilizer(IAgriFertilizer fertilizer, Random rand);

}