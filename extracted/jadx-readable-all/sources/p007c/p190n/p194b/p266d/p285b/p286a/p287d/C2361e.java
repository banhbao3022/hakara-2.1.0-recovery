package p007c.p190n.p194b.p266d.p285b.p286a.p287d;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2361e implements Comparator {

    /* JADX INFO: renamed from: f */
    public static final Comparator f10953f = new C2361e();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).f28647g.compareTo(((Scope) obj2).f28647g);
    }
}
