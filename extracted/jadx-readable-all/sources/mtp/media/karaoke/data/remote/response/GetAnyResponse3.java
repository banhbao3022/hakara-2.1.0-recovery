package mtp.media.karaoke.data.remote.response;

/* JADX INFO: renamed from: mtp.media.karaoke.data.remote.response.GetExchangeDiamondsResponse, reason: use source file name */
/* JADX INFO: compiled from: GetAnyResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetAnyResponse3 extends BaseResponse {
    private final int amount;
    private final int status;

    public GetAnyResponse3(int i, int i2) {
        this.status = i;
        this.amount = i2;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getStatus() {
        return this.status;
    }
}
