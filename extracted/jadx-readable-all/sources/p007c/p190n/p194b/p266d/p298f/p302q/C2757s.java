package p007c.p190n.p194b.p266d.p298f.p302q;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.f.q.s */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2757s extends AbstractC2767a {
    public static final Parcelable.Creator<C2757s> CREATOR = new C2727f0();

    /* JADX INFO: renamed from: f */
    public final int f11905f;

    /* JADX INFO: renamed from: g */
    public final Account f11906g;

    /* JADX INFO: renamed from: h */
    public final int f11907h;

    /* JADX INFO: renamed from: i */
    public final GoogleSignInAccount f11908i;

    public C2757s(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f11905f = i;
        this.f11906g = account;
        this.f11907h = i2;
        this.f11908i = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f11905f;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5311T(parcel, 2, this.f11906g, i, false);
        int i3 = this.f11907h;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        C2622l.m5311T(parcel, 4, this.f11908i, i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2757s(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this.f11905f = 2;
        this.f11906g = account;
        this.f11907h = i;
        this.f11908i = googleSignInAccount;
    }
}
