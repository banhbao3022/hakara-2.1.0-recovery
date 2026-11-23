package mtp.media.karaoke.data.remote.response;

import p477d1.p493x.p495c.DefaultConstructorMarker;

/* JADX INFO: compiled from: GetCollectedRewardResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetCollectedRewardResponse {
    private final int coins;
    private final int diamonds;
    private final int exps;
    private final int status;

    public GetCollectedRewardResponse(int i, int i2, int i3, int i4) {
        this.status = i;
        this.coins = i2;
        this.exps = i3;
        this.diamonds = i4;
    }

    public final int getCoins() {
        return this.coins;
    }

    public final int getDiamonds() {
        return this.diamonds;
    }

    public final int getExps() {
        return this.exps;
    }

    public final int getStatus() {
        return this.status;
    }

    public /* synthetic */ GetCollectedRewardResponse(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
