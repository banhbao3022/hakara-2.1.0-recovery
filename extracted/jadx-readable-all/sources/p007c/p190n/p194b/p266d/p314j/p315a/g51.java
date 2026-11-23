package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class g51 implements ia1<i51> {

    /* JADX INFO: renamed from: a */
    public final lv1 f14502a;

    /* JADX INFO: renamed from: b */
    public final Context f14503b;

    /* JADX INFO: renamed from: c */
    public final ii1 f14504c;

    /* JADX INFO: renamed from: d */
    public final View f14505d;

    public g51(lv1 lv1Var, Context context, ii1 ii1Var, ViewGroup viewGroup) {
        this.f14502a = lv1Var;
        this.f14503b = context;
        this.f14504c = ii1Var;
        this.f14505d = viewGroup;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<i51> zza() {
        return this.f14502a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.f51

            /* JADX INFO: renamed from: a */
            public final g51 f13790a;

            {
                this.f13790a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                g51 g51Var = this.f13790a;
                Context context = g51Var.f14503b;
                jw2 jw2Var = g51Var.f14504c.f15192e;
                ArrayList arrayList = new ArrayList();
                View view = g51Var.f14505d;
                while (view != null) {
                    Object parent = view.getParent();
                    if (parent == null) {
                        break;
                    }
                    int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
                    Bundle bundle = new Bundle();
                    bundle.putString("type", parent.getClass().getName());
                    bundle.putInt("index_of_child", iIndexOfChild);
                    arrayList.add(bundle);
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                }
                return new i51(context, jw2Var, arrayList);
            }
        });
    }
}
