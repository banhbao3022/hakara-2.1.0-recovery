package mtp.media.karaoke.data.remote.response;

import java.util.ArrayList;
import p007c.p190n.p430e.p431d0.SerializedName;
import p477d1.p493x.p495c.DefaultConstructorMarker;

/* JADX INFO: compiled from: BaseListResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public class BaseListResponse<Item> extends BaseResponse {

    @SerializedName("data")
    private ArrayList<Item> results;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseListResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BaseListResponse(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList);
    }

    public final ArrayList<Item> getResults() {
        return this.results;
    }

    public final void setResults(ArrayList<Item> arrayList) {
        this.results = arrayList;
    }

    public BaseListResponse(ArrayList<Item> arrayList) {
        this.results = arrayList;
    }
}
