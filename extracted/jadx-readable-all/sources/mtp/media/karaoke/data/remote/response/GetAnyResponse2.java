package mtp.media.karaoke.data.remote.response;

import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: mtp.media.karaoke.data.remote.response.GetCommonResponse, reason: use source file name */
/* JADX INFO: compiled from: GetAnyResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetAnyResponse2 extends BaseResponse {
    private final String message;
    private final int status;

    public GetAnyResponse2(int i, String str) {
        Intrinsics2.m13089e(str, "message");
        this.status = i;
        this.message = str;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatus() {
        return this.status;
    }
}
