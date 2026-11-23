package mtp.media.karaoke.data.remote.response;

import p007c.p190n.p430e.p431d0.SerializedName;
import p477d1.p493x.p495c.DefaultConstructorMarker;

/* JADX INFO: compiled from: GetItemResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetItemResponse<Item> extends BaseResponse {

    @SerializedName("data")
    private Item results;

    /* JADX WARN: Illegal instructions before constructor call */
    public GetItemResponse() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public /* synthetic */ GetItemResponse(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }

    public final Item getResults() {
        return this.results;
    }

    public final void setResults(Item item) {
        this.results = item;
    }

    public GetItemResponse(Item item) {
        this.results = item;
    }
}
