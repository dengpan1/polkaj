package io.emeraldpay.polkaj.api;

import io.emeraldpay.polkaj.json.BlockJson;
import io.emeraldpay.polkaj.json.RuntimeVersionJson;

/**
 * Standard/common Polkadot subscriptions
 */
public class StandardSubscriptions {

    private static final StandardSubscriptions instance = new StandardSubscriptions();

    public static StandardSubscriptions getInstance() {
        return instance;
    }

    /**
     * Subscribe to new headers
     *
     * @return command
     */
    public SubscribeCall<BlockJson.Header> newHeads() {
        return SubscribeCall.create(BlockJson.Header.class, "chain_subscribeNewHead", "chain_unsubscribeNewHead");
    }

    /**
     * Subscribe to finalized headers
     *
     * @return command
     */
    public SubscribeCall<BlockJson.Header> finalizedHeads() {
        return SubscribeCall.create(BlockJson.Header.class, "chain_subscribeFinalizedHeads", "chain_unsubscribeFinalizedHeads");
    }

    /**
     * Subscribe to new runtime versions
     *
     * @return command
     */
    public SubscribeCall<RuntimeVersionJson> runtimeVersion() {
        return SubscribeCall.create(RuntimeVersionJson.class, "chain_subscribeRuntimeVersion", "chain_unsubscribeRuntimeVersion");
    }
}
