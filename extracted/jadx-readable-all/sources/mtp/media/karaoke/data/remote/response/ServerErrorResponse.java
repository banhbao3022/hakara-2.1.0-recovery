package mtp.media.karaoke.data.remote.response;

import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: ServerErrorResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ServerErrorResponse {
    private final String message;
    private final Integer status;

    /* JADX WARN: Multi-variable type inference failed */
    public ServerErrorResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ServerErrorResponse(Integer num, String str) {
        this.status = num;
        this.message = str;
    }

    public static /* synthetic */ ServerErrorResponse copy$default(ServerErrorResponse serverErrorResponse, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = serverErrorResponse.status;
        }
        if ((i & 2) != 0) {
            str = serverErrorResponse.message;
        }
        return serverErrorResponse.copy(num, str);
    }

    public final Integer component1() {
        return this.status;
    }

    public final String component2() {
        return this.message;
    }

    public final ServerErrorResponse copy(Integer num, String str) {
        return new ServerErrorResponse(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerErrorResponse)) {
            return false;
        }
        ServerErrorResponse serverErrorResponse = (ServerErrorResponse) obj;
        return Intrinsics2.m13085a(this.status, serverErrorResponse.status) && Intrinsics2.m13085a(this.message, serverErrorResponse.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        Integer num = this.status;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ServerErrorResponse(status=");
        sbM1556G.append(this.status);
        sbM1556G.append(", message=");
        return outline.m1550A(sbM1556G, this.message, ")");
    }

    public /* synthetic */ ServerErrorResponse(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
