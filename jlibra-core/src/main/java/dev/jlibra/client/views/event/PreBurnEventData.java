package dev.jlibra.client.views.event;

import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import dev.jlibra.client.views.Amount;

@Value.Immutable
@JsonDeserialize(as = ImmutablePreBurnEventData.class)
public interface PreBurnEventData extends EventData {

    @JsonProperty("amount")
    Amount amount();

    @JsonProperty("preburn_address")
    String preburnAddress();
}
