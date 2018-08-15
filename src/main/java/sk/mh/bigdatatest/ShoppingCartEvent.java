package sk.mh.bigdatatest;

/**
 * Created by matus.hozza on 7/28/2018.
 */

public class ShoppingCartEvent {
    private String id;
    private String store_id;
    private String customer_id;
    private String sensor_id;
    private String sensor_metadata;
    private long timestamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getSensor_metadata() {
        return sensor_metadata;
    }

    public void setSensor_metadata(String sensor_metadata) {
        this.sensor_metadata = sensor_metadata;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


    public static final class Builder {
        private String id;
        private String store_id;
        private String customer_id;
        private String sensor_id;
        private String sensor_metadata;
        private long timestamp;

        private Builder() {
        }

        public static Builder aShoppingCartEvent() {
            return new Builder();
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withStore_id(String store_id) {
            this.store_id = store_id;
            return this;
        }

        public Builder withCustomer_id(String customer_id) {
            this.customer_id = customer_id;
            return this;
        }

        public Builder withSensor_id(String sensor_id) {
            this.sensor_id = sensor_id;
            return this;
        }

        public Builder withSensor_metadata(String sensor_metadata) {
            this.sensor_metadata = sensor_metadata;
            return this;
        }

        public Builder withTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ShoppingCartEvent build() {
            ShoppingCartEvent shoppingCartEvent = new ShoppingCartEvent();
            shoppingCartEvent.setId(id);
            shoppingCartEvent.setStore_id(store_id);
            shoppingCartEvent.setCustomer_id(customer_id);
            shoppingCartEvent.setSensor_id(sensor_id);
            shoppingCartEvent.setSensor_metadata(sensor_metadata);
            shoppingCartEvent.setTimestamp(timestamp);
            return shoppingCartEvent;
        }
    }
}