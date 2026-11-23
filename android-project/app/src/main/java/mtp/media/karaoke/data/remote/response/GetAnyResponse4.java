package mtp.media.karaoke.data.remote.response;

import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: mtp.media.karaoke.data.remote.response.GetSongLinkResponse, reason: use source file name */
/* JADX INFO: compiled from: GetAnyResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetAnyResponse4 extends BaseResponse {
    private final String link;
    private final int status;

    public GetAnyResponse4(int i, String str) {
        Intrinsics2.m13089e(str, "link");
        this.status = i;
        this.link = str;
    }

    public final String getLink() {
        return this.link;
    }

    public final int getStatus() {
        return this.status;
    }
}
