package mtp.media.karaoke.data.remote.response;

import p007c.p190n.p430e.p431d0.SerializedName;
import p477d1.p493x.p495c.DefaultConstructorMarker;

/* JADX INFO: compiled from: BaseItemResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public class BaseItemResponse<Item> extends BaseResponse {

    @SerializedName("data")
    private Item results;

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseItemResponse() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public /* synthetic */ BaseItemResponse(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }

    public final Item getResults() {
        return this.results;
    }

    public final void setResults(Item item) {
        this.results = item;
    }

    public BaseItemResponse(Item item) {
        this.results = item;
    }
}
