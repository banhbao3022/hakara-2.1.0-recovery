package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class z71 implements ia1<a81> {

    /* JADX INFO: renamed from: a */
    public final lv1 f22191a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f22192b;

    /* JADX INFO: renamed from: c */
    public final Context f22193c;

    /* JADX INFO: renamed from: d */
    public final Set<String> f22194d;

    public z71(lv1 lv1Var, ViewGroup viewGroup, Context context, Set<String> set) {
        this.f22191a = lv1Var;
        this.f22194d = set;
        this.f22192b = viewGroup;
        this.f22193c = context;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<a81> zza() {
        return this.f22191a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.y71

            /* JADX INFO: renamed from: a */
            public final z71 f21750a;

            {
                this.f21750a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                z71 z71Var = this.f21750a;
                Objects.requireNonNull(z71Var);
                AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14489z3;
                C2862b c2862b = C2862b.f12493a;
                if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && z71Var.f22192b != null && z71Var.f22194d.contains("banner")) {
                    return new a81(Boolean.valueOf(z71Var.f22192b.isHardwareAccelerated()));
                }
                boolean zBooleanValue = ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14153A3)).booleanValue();
                Boolean boolValueOf = null;
                if (zBooleanValue && z71Var.f22194d.contains("native")) {
                    Context context = z71Var.f22193c;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        Window window = activity.getWindow();
                        if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                            try {
                                boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        } else {
                            boolValueOf = Boolean.TRUE;
                        }
                        return new a81(boolValueOf);
                    }
                }
                return new a81(null);
            }
        });
    }
}
