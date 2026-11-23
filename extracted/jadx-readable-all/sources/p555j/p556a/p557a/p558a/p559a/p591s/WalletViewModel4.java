package p555j.p556a.p557a.p558a.p559a.p591s;

import com.android.billingclient.api.Purchase;
import java.util.Objects;
import p007c.p071d.p072a.p073a.C0519f;
import p007c.p071d.p072a.p073a.InterfaceC0523h;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: j.a.a.a.a.s.j, reason: use source file name */
/* JADX INFO: compiled from: WalletViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WalletViewModel4 implements InterfaceC0523h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Purchase f31973a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WalletViewModel5 f31974b;

    public WalletViewModel4(Purchase purchase, WalletViewModel5 walletViewModel5) {
        this.f31973a = purchase;
        this.f31974b = walletViewModel5;
    }

    @Override // p007c.p071d.p072a.p073a.InterfaceC0523h
    /* JADX INFO: renamed from: a */
    public final void mo1542a(C0519f c0519f, String str) {
        Intrinsics2.m13089e(c0519f, "billingResult");
        Intrinsics2.m13089e(str, "purchaseToken");
        if (c0519f.f2715a != 0) {
            StringBuilder sbM1556G = outline.m1556G("handleConsumablePurchasesAsync: ");
            sbM1556G.append(c0519f.f2716b);
            Intrinsics2.m13089e(sbM1556G.toString(), "message");
        } else {
            WalletViewModel5 walletViewModel5 = this.f31974b;
            Purchase purchase = this.f31973a;
            Objects.requireNonNull(walletViewModel5);
            C5729a.m12428A(C8310a.m16440e(walletViewModel5), null, 0, new WalletViewModel(walletViewModel5, purchase, null), 3, null);
        }
    }
}
