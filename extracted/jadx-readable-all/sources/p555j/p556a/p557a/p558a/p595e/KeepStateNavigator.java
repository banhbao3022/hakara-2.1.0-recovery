package p555j.p556a.p557a.p558a.p595e;

import android.content.Context;
import android.os.Bundle;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentManager;
import p636z0.p752p.p753c.FragmentTransaction;
import p636z0.p770y.NavDestination;
import p636z0.p770y.NavOptions;
import p636z0.p770y.Navigator;
import p636z0.p770y.p772u.FragmentNavigator;

/* JADX INFO: renamed from: j.a.a.a.e.a, reason: use source file name */
/* JADX INFO: compiled from: KeepStateNavigator.kt */
/* JADX INFO: loaded from: classes2.dex */
@Navigator.b("keep_state_fragment")
public final class KeepStateNavigator extends FragmentNavigator {

    /* JADX INFO: renamed from: e */
    public final Context f32057e;

    /* JADX INFO: renamed from: f */
    public final FragmentManager f32058f;

    /* JADX INFO: renamed from: g */
    public final int f32059g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeepStateNavigator(Context context, FragmentManager fragmentManager, int i) {
        super(context, fragmentManager, i);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(fragmentManager, "fragmentManager");
        this.f32057e = context;
        this.f32058f = fragmentManager;
        this.f32059g = i;
    }

    @Override // p636z0.p770y.p772u.FragmentNavigator, p636z0.p770y.Navigator
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public NavDestination mo458b(FragmentNavigator.a aVar, Bundle bundle, NavOptions navOptions, Navigator.a aVar2) {
        boolean z;
        Intrinsics2.m13089e(aVar, "destination");
        Intrinsics2.m13089e("navigate", "message");
        String strValueOf = String.valueOf(aVar.f39033h);
        BackStackRecord backStackRecord = new BackStackRecord(this.f32058f);
        Intrinsics2.m13088d(backStackRecord, "fragmentManager.beginTransaction()");
        Intrinsics2.m13089e("tag " + strValueOf, "message");
        Fragment fragment = this.f32058f.f38634t;
        if (fragment != null) {
            FragmentManager fragmentManager = fragment.f38450y;
            if (fragmentManager != null && fragmentManager != backStackRecord.f38261q) {
                StringBuilder sbM1556G = outline.m1556G("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
                sbM1556G.append(fragment.toString());
                sbM1556G.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(sbM1556G.toString());
            }
            backStackRecord.m16505b(new FragmentTransaction.a(4, fragment));
            Intrinsics2.m13088d(backStackRecord, "fragmentTransaction.hide(currentFragment)");
            z = false;
        } else {
            z = true;
        }
        Fragment fragmentM16656I = this.f32058f.m16656I(strValueOf);
        if (fragmentM16656I == null) {
            String str = aVar.f39099n;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set");
            }
            Intrinsics2.m13088d(str, "destination.className");
            fragmentM16656I = this.f32058f.m16658K().mo16614a(this.f32057e.getClassLoader(), str);
            if (fragmentM16656I.m16550S()) {
                backStackRecord.mo16452m(fragmentM16656I);
            } else {
                backStackRecord.mo16448g(this.f32059g, fragmentM16656I, strValueOf, 1);
            }
        } else {
            backStackRecord.mo16452m(fragmentM16656I);
        }
        backStackRecord.mo16451l(fragmentM16656I);
        backStackRecord.f38367p = true;
        backStackRecord.mo16445d();
        Intrinsics2.m13089e("initialNavigate " + z, "message");
        if (z) {
            return aVar;
        }
        return null;
    }
}
