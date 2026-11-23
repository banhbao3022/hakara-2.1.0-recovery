package p007c.p190n.p194b.p367f.p368a.p370b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5086d0;
import p007c.p190n.p194b.p367f.p368a.p374e.AbstractC5126c;

/* JADX INFO: renamed from: c.n.b.f.a.b.r */
/* JADX INFO: loaded from: classes.dex */
public final class C5046r extends AbstractC5126c<AssetPackState> {

    /* JADX INFO: renamed from: g */
    public final C5066x0 f25933g;

    /* JADX INFO: renamed from: h */
    public final C5015j0 f25934h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5086d0<InterfaceC5037o2> f25935i;

    /* JADX INFO: renamed from: j */
    public final C4991d0 f25936j;

    /* JADX INFO: renamed from: k */
    public final C5027m0 f25937k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5086d0<Executor> f25938l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC5086d0<Executor> f25939m;

    /* JADX INFO: renamed from: n */
    public final Handler f25940n;

    public C5046r(Context context, C5066x0 c5066x0, C5015j0 c5015j0, InterfaceC5086d0<InterfaceC5037o2> interfaceC5086d0, C5027m0 c5027m0, C4991d0 c4991d0, InterfaceC5086d0<Executor> interfaceC5086d1, InterfaceC5086d0<Executor> interfaceC5086d2) {
        super(new C5089f("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f25940n = new Handler(Looper.getMainLooper());
        this.f25933g = c5066x0;
        this.f25934h = c5015j0;
        this.f25935i = interfaceC5086d0;
        this.f25937k = c5027m0;
        this.f25936j = c4991d0;
        this.f25938l = interfaceC5086d1;
        this.f25939m = interfaceC5086d2;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p374e.AbstractC5126c
    /* JADX INFO: renamed from: a */
    public final void mo11469a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.f26077a.m11533b(6, "Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.f26077a.m11533b(6, "Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        final AssetPackState assetPackStateM12911e = AssetPackState.m12911e(bundleExtra, stringArrayList.get(0), this.f25937k, C5053t.f25956b);
        this.f26077a.m11533b(3, "ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{assetPackStateM12911e});
        if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
            Objects.requireNonNull(this.f25936j);
        }
        this.f25939m.m11529a().execute(new Runnable(this, bundleExtra, assetPackStateM12911e) { // from class: c.n.b.f.a.b.p

            /* JADX INFO: renamed from: f */
            public final C5046r f25904f;

            /* JADX INFO: renamed from: g */
            public final Bundle f25905g;

            /* JADX INFO: renamed from: h */
            public final AssetPackState f25906h;

            {
                this.f25904f = this;
                this.f25905g = bundleExtra;
                this.f25906h = assetPackStateM12911e;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C5046r c5046r = this.f25904f;
                Bundle bundle = this.f25905g;
                AssetPackState assetPackState = this.f25906h;
                C5066x0 c5066x0 = c5046r.f25933g;
                if (((Boolean) c5066x0.m11511b(new C5035o0(c5066x0, bundle))).booleanValue()) {
                    c5046r.f25940n.post(new RunnableC5034o(c5046r, assetPackState));
                    c5046r.f25935i.m11529a().mo11433a();
                }
            }
        });
        this.f25938l.m11529a().execute(new Runnable(this, bundleExtra) { // from class: c.n.b.f.a.b.q

            /* JADX INFO: renamed from: f */
            public final C5046r f25917f;

            /* JADX INFO: renamed from: g */
            public final Bundle f25918g;

            {
                this.f25917f = this;
                this.f25918g = bundleExtra;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public final void run() {
                C5072z0 c5072z0M11419a;
                C5046r c5046r = this.f25917f;
                Bundle bundle = this.f25918g;
                C5066x0 c5066x0 = c5046r.f25933g;
                if (!((Boolean) c5066x0.m11511b(new C5035o0(c5066x0, bundle, null))).booleanValue()) {
                    return;
                }
                C5015j0 c5015j0 = c5046r.f25934h;
                Objects.requireNonNull(c5015j0);
                C5089f c5089f = C5015j0.f25831a;
                c5089f.m11533b(3, "Run extractor loop", new Object[0]);
                if (!c5015j0.f25840j.compareAndSet(false, true)) {
                    c5089f.m11533b(5, "runLoop already looping; return", new Object[0]);
                    return;
                }
                while (true) {
                    try {
                        c5072z0M11419a = c5015j0.f25839i.m11419a();
                    } catch (C5011i0 e) {
                        C5015j0.f25831a.m11533b(6, "Error while getting next extraction task: %s", new Object[]{e.getMessage()});
                        if (e.f25825f >= 0) {
                            c5015j0.f25838h.m11529a().mo11434b(e.f25825f);
                            c5015j0.m11457a(e.f25825f, e);
                        }
                        c5072z0M11419a = null;
                    }
                    if (c5072z0M11419a == null) {
                        c5015j0.f25840j.set(false);
                        return;
                    }
                    try {
                        if (c5072z0M11419a instanceof C5003g0) {
                            c5015j0.f25833c.m11449a((C5003g0) c5072z0M11419a);
                        } else if (c5072z0M11419a instanceof C5064w1) {
                            c5015j0.f25834d.m11513a((C5064w1) c5072z0M11419a);
                        } else if (c5072z0M11419a instanceof C5008h1) {
                            c5015j0.f25835e.m11456a((C5008h1) c5072z0M11419a);
                        } else if (c5072z0M11419a instanceof C5020k1) {
                            c5015j0.f25836f.m11465a((C5020k1) c5072z0M11419a);
                        } else if (c5072z0M11419a instanceof C5044q1) {
                            c5015j0.f25837g.m11470a((C5044q1) c5072z0M11419a);
                        } else {
                            C5015j0.f25831a.m11533b(6, "Unknown task type: %s", new Object[]{c5072z0M11419a.getClass().getName()});
                        }
                    } catch (Exception e2) {
                        C5015j0.f25831a.m11533b(6, "Error during extraction task: %s", new Object[]{e2.getMessage()});
                        c5015j0.f25838h.m11529a().mo11434b(c5072z0M11419a.f26030a);
                        c5015j0.m11457a(c5072z0M11419a.f26030a, e2);
                    }
                }
            }
        });
    }
}
