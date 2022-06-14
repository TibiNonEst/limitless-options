package me.tibinonest.limitless_options.mixin;

import net.minecraft.client.option.Option;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Optional;

@Mixin(Option.IntRangeValueSet.class)
public class OptionMixin {
	/**
	 * @author TibiNonEst
	 * @reason Remove 1.19s option limit
	 */
	@Overwrite
	public Optional<Integer> validate(Integer integer) {
		return Optional.of(integer);
	}
}
