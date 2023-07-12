/*
 * Gate API v4
 * Welcome to Gate.io API  APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.gate.gateapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Options order detail
 */
public class OptionsOrder {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Long id;

    public static final String SERIALIZED_NAME_USER = "user";
    @SerializedName(SERIALIZED_NAME_USER)
    private Integer user;

    public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
    @SerializedName(SERIALIZED_NAME_CREATE_TIME)
    private Double createTime;

    public static final String SERIALIZED_NAME_FINISH_TIME = "finish_time";
    @SerializedName(SERIALIZED_NAME_FINISH_TIME)
    private Double finishTime;

    /**
     * How the order was finished.  - filled: all filled - cancelled: manually cancelled - liquidated: cancelled because of liquidation - ioc: time in force is &#x60;IOC&#x60;, finish immediately - auto_deleveraged: finished by ADL - reduce_only: cancelled because of increasing position while &#x60;reduce-only&#x60; set- position_closed: cancelled because of position close 
     */
    @JsonAdapter(FinishAsEnum.Adapter.class)
    public enum FinishAsEnum {
        FILLED("filled"),
        
        CANCELLED("cancelled"),
        
        LIQUIDATED("liquidated"),
        
        IOC("ioc"),
        
        AUTO_DELEVERAGED("auto_deleveraged"),
        
        REDUCE_ONLY("reduce_only"),
        
        POSITION_CLOSED("position_closed"),
        
        REDUCE_OUT("reduce_out");

        private String value;

        FinishAsEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FinishAsEnum fromValue(String value) {
            for (FinishAsEnum b : FinishAsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<FinishAsEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FinishAsEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FinishAsEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return FinishAsEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_FINISH_AS = "finish_as";
    @SerializedName(SERIALIZED_NAME_FINISH_AS)
    private FinishAsEnum finishAs;

    /**
     * Order status  - &#x60;open&#x60;: waiting to be traded - &#x60;finished&#x60;: finished
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        OPEN("open"),
        
        FINISHED("finished");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return StatusEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private StatusEnum status;

    public static final String SERIALIZED_NAME_CONTRACT = "contract";
    @SerializedName(SERIALIZED_NAME_CONTRACT)
    private String contract;

    public static final String SERIALIZED_NAME_SIZE = "size";
    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_ICEBERG = "iceberg";
    @SerializedName(SERIALIZED_NAME_ICEBERG)
    private Long iceberg;

    public static final String SERIALIZED_NAME_PRICE = "price";
    @SerializedName(SERIALIZED_NAME_PRICE)
    private String price;

    public static final String SERIALIZED_NAME_CLOSE = "close";
    @SerializedName(SERIALIZED_NAME_CLOSE)
    private Boolean close = false;

    public static final String SERIALIZED_NAME_IS_CLOSE = "is_close";
    @SerializedName(SERIALIZED_NAME_IS_CLOSE)
    private Boolean isClose;

    public static final String SERIALIZED_NAME_REDUCE_ONLY = "reduce_only";
    @SerializedName(SERIALIZED_NAME_REDUCE_ONLY)
    private Boolean reduceOnly = false;

    public static final String SERIALIZED_NAME_IS_REDUCE_ONLY = "is_reduce_only";
    @SerializedName(SERIALIZED_NAME_IS_REDUCE_ONLY)
    private Boolean isReduceOnly;

    public static final String SERIALIZED_NAME_IS_LIQ = "is_liq";
    @SerializedName(SERIALIZED_NAME_IS_LIQ)
    private Boolean isLiq;

    /**
     * Time in force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only - poc: PendingOrCancelled, reduce-only
     */
    @JsonAdapter(TifEnum.Adapter.class)
    public enum TifEnum {
        GTC("gtc"),
        
        IOC("ioc"),
        
        POC("poc");

        private String value;

        TifEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TifEnum fromValue(String value) {
            for (TifEnum b : TifEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TifEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TifEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TifEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return TifEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_TIF = "tif";
    @SerializedName(SERIALIZED_NAME_TIF)
    private TifEnum tif = TifEnum.GTC;

    public static final String SERIALIZED_NAME_LEFT = "left";
    @SerializedName(SERIALIZED_NAME_LEFT)
    private Long left;

    public static final String SERIALIZED_NAME_FILL_PRICE = "fill_price";
    @SerializedName(SERIALIZED_NAME_FILL_PRICE)
    private String fillPrice;

    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;

    public static final String SERIALIZED_NAME_TKFR = "tkfr";
    @SerializedName(SERIALIZED_NAME_TKFR)
    private String tkfr;

    public static final String SERIALIZED_NAME_MKFR = "mkfr";
    @SerializedName(SERIALIZED_NAME_MKFR)
    private String mkfr;

    public static final String SERIALIZED_NAME_REFU = "refu";
    @SerializedName(SERIALIZED_NAME_REFU)
    private Integer refu;


     /**
     * Options order ID
     * @return id
    **/
    @javax.annotation.Nullable
    public Long getId() {
        return id;
    }


     /**
     * User ID
     * @return user
    **/
    @javax.annotation.Nullable
    public Integer getUser() {
        return user;
    }


     /**
     * Creation time of order
     * @return createTime
    **/
    @javax.annotation.Nullable
    public Double getCreateTime() {
        return createTime;
    }


     /**
     * Order finished time. Not returned if order is open
     * @return finishTime
    **/
    @javax.annotation.Nullable
    public Double getFinishTime() {
        return finishTime;
    }


     /**
     * How the order was finished.  - filled: all filled - cancelled: manually cancelled - liquidated: cancelled because of liquidation - ioc: time in force is &#x60;IOC&#x60;, finish immediately - auto_deleveraged: finished by ADL - reduce_only: cancelled because of increasing position while &#x60;reduce-only&#x60; set- position_closed: cancelled because of position close 
     * @return finishAs
    **/
    @javax.annotation.Nullable
    public FinishAsEnum getFinishAs() {
        return finishAs;
    }


     /**
     * Order status  - &#x60;open&#x60;: waiting to be traded - &#x60;finished&#x60;: finished
     * @return status
    **/
    @javax.annotation.Nullable
    public StatusEnum getStatus() {
        return status;
    }


    public OptionsOrder contract(String contract) {
        
        this.contract = contract;
        return this;
    }

     /**
     * Contract name
     * @return contract
    **/
    public String getContract() {
        return contract;
    }


    public void setContract(String contract) {
        this.contract = contract;
    }

    public OptionsOrder size(Long size) {
        
        this.size = size;
        return this;
    }

     /**
     * Order size. Specify positive number to make a bid, and negative number to ask
     * @return size
    **/
    public Long getSize() {
        return size;
    }


    public void setSize(Long size) {
        this.size = size;
    }

    public OptionsOrder iceberg(Long iceberg) {
        
        this.iceberg = iceberg;
        return this;
    }

     /**
     * Display size for iceberg order. 0 for non-iceberg. Note that you will have to pay the taker fee for the hidden size
     * @return iceberg
    **/
    @javax.annotation.Nullable
    public Long getIceberg() {
        return iceberg;
    }


    public void setIceberg(Long iceberg) {
        this.iceberg = iceberg;
    }

    public OptionsOrder price(String price) {
        
        this.price = price;
        return this;
    }

     /**
     * Order price. 0 for market order with &#x60;tif&#x60; set as &#x60;ioc&#x60;
     * @return price
    **/
    @javax.annotation.Nullable
    public String getPrice() {
        return price;
    }


    public void setPrice(String price) {
        this.price = price;
    }

    public OptionsOrder close(Boolean close) {
        
        this.close = close;
        return this;
    }

     /**
     * Set as &#x60;true&#x60; to close the position, with &#x60;size&#x60; set to 0
     * @return close
    **/
    @javax.annotation.Nullable
    public Boolean getClose() {
        return close;
    }


    public void setClose(Boolean close) {
        this.close = close;
    }

     /**
     * Is the order to close position
     * @return isClose
    **/
    @javax.annotation.Nullable
    public Boolean getIsClose() {
        return isClose;
    }


    public OptionsOrder reduceOnly(Boolean reduceOnly) {
        
        this.reduceOnly = reduceOnly;
        return this;
    }

     /**
     * Set as &#x60;true&#x60; to be reduce-only order
     * @return reduceOnly
    **/
    @javax.annotation.Nullable
    public Boolean getReduceOnly() {
        return reduceOnly;
    }


    public void setReduceOnly(Boolean reduceOnly) {
        this.reduceOnly = reduceOnly;
    }

     /**
     * Is the order reduce-only
     * @return isReduceOnly
    **/
    @javax.annotation.Nullable
    public Boolean getIsReduceOnly() {
        return isReduceOnly;
    }


     /**
     * Is the order for liquidation
     * @return isLiq
    **/
    @javax.annotation.Nullable
    public Boolean getIsLiq() {
        return isLiq;
    }


    public OptionsOrder tif(TifEnum tif) {
        
        this.tif = tif;
        return this;
    }

     /**
     * Time in force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only - poc: PendingOrCancelled, reduce-only
     * @return tif
    **/
    @javax.annotation.Nullable
    public TifEnum getTif() {
        return tif;
    }


    public void setTif(TifEnum tif) {
        this.tif = tif;
    }

     /**
     * Size left to be traded
     * @return left
    **/
    @javax.annotation.Nullable
    public Long getLeft() {
        return left;
    }


     /**
     * Fill price of the order
     * @return fillPrice
    **/
    @javax.annotation.Nullable
    public String getFillPrice() {
        return fillPrice;
    }


    public OptionsOrder text(String text) {
        
        this.text = text;
        return this;
    }

     /**
     * User defined information. If not empty, must follow the rules below:  1. prefixed with &#x60;t-&#x60; 2. no longer than 28 bytes without &#x60;t-&#x60; prefix 3. can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.) Besides user defined information, reserved contents are listed below, denoting how the order is created:  - web: from web - api: from API - app: from mobile phones - auto_deleveraging: from ADL - liquidation: from liquidation - insurance: from insurance 
     * @return text
    **/
    @javax.annotation.Nullable
    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }

     /**
     * Taker fee
     * @return tkfr
    **/
    @javax.annotation.Nullable
    public String getTkfr() {
        return tkfr;
    }


     /**
     * Maker fee
     * @return mkfr
    **/
    @javax.annotation.Nullable
    public String getMkfr() {
        return mkfr;
    }


     /**
     * Reference user ID
     * @return refu
    **/
    @javax.annotation.Nullable
    public Integer getRefu() {
        return refu;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OptionsOrder optionsOrder = (OptionsOrder) o;
        return Objects.equals(this.id, optionsOrder.id) &&
                Objects.equals(this.user, optionsOrder.user) &&
                Objects.equals(this.createTime, optionsOrder.createTime) &&
                Objects.equals(this.finishTime, optionsOrder.finishTime) &&
                Objects.equals(this.finishAs, optionsOrder.finishAs) &&
                Objects.equals(this.status, optionsOrder.status) &&
                Objects.equals(this.contract, optionsOrder.contract) &&
                Objects.equals(this.size, optionsOrder.size) &&
                Objects.equals(this.iceberg, optionsOrder.iceberg) &&
                Objects.equals(this.price, optionsOrder.price) &&
                Objects.equals(this.close, optionsOrder.close) &&
                Objects.equals(this.isClose, optionsOrder.isClose) &&
                Objects.equals(this.reduceOnly, optionsOrder.reduceOnly) &&
                Objects.equals(this.isReduceOnly, optionsOrder.isReduceOnly) &&
                Objects.equals(this.isLiq, optionsOrder.isLiq) &&
                Objects.equals(this.tif, optionsOrder.tif) &&
                Objects.equals(this.left, optionsOrder.left) &&
                Objects.equals(this.fillPrice, optionsOrder.fillPrice) &&
                Objects.equals(this.text, optionsOrder.text) &&
                Objects.equals(this.tkfr, optionsOrder.tkfr) &&
                Objects.equals(this.mkfr, optionsOrder.mkfr) &&
                Objects.equals(this.refu, optionsOrder.refu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, createTime, finishTime, finishAs, status, contract, size, iceberg, price, close, isClose, reduceOnly, isReduceOnly, isLiq, tif, left, fillPrice, text, tkfr, mkfr, refu);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OptionsOrder {\n");
        sb.append("      id: ").append(toIndentedString(id)).append("\n");
        sb.append("      user: ").append(toIndentedString(user)).append("\n");
        sb.append("      createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("      finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("      finishAs: ").append(toIndentedString(finishAs)).append("\n");
        sb.append("      status: ").append(toIndentedString(status)).append("\n");
        sb.append("      contract: ").append(toIndentedString(contract)).append("\n");
        sb.append("      size: ").append(toIndentedString(size)).append("\n");
        sb.append("      iceberg: ").append(toIndentedString(iceberg)).append("\n");
        sb.append("      price: ").append(toIndentedString(price)).append("\n");
        sb.append("      close: ").append(toIndentedString(close)).append("\n");
        sb.append("      isClose: ").append(toIndentedString(isClose)).append("\n");
        sb.append("      reduceOnly: ").append(toIndentedString(reduceOnly)).append("\n");
        sb.append("      isReduceOnly: ").append(toIndentedString(isReduceOnly)).append("\n");
        sb.append("      isLiq: ").append(toIndentedString(isLiq)).append("\n");
        sb.append("      tif: ").append(toIndentedString(tif)).append("\n");
        sb.append("      left: ").append(toIndentedString(left)).append("\n");
        sb.append("      fillPrice: ").append(toIndentedString(fillPrice)).append("\n");
        sb.append("      text: ").append(toIndentedString(text)).append("\n");
        sb.append("      tkfr: ").append(toIndentedString(tkfr)).append("\n");
        sb.append("      mkfr: ").append(toIndentedString(mkfr)).append("\n");
        sb.append("      refu: ").append(toIndentedString(refu)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n        ");
    }

}
