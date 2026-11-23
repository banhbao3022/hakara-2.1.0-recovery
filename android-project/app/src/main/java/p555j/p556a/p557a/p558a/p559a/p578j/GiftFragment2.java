package p555j.p556a.p557a.p558a.p559a.p578j;

import android.content.Context;
import java.util.Objects;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.wallet.WalletActivity;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: j.a.a.a.a.j.c, reason: use source file name */
/* JADX INFO: compiled from: GiftFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GiftFragment2 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ GiftFragment.h f31562g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftFragment2(User user, GiftFragment.h hVar) {
        super(0);
        this.f31562g = hVar;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        GiftFragment giftFragment = GiftFragment.this;
        GiftFragment.c cVar = GiftFragment.f31535t0;
        Objects.requireNonNull(giftFragment);
        WalletActivity.C7381b c7381b = WalletActivity.f34028w;
        Context contextM16528G0 = giftFragment.m16528G0();
        Intrinsics2.m13088d(contextM16528G0, "requireContext()");
        giftFragment.m13973h1(c7381b.m14467a(contextM16528G0));
        return Unit.f29502a;
    }
}
