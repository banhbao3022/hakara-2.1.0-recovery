package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import android.view.View;
import com.facebook.stetho.common.Utf8Charset;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mh0 {

    /* JADX INFO: renamed from: a */
    public final yl0 f16756a;

    /* JADX INFO: renamed from: b */
    public final vk0 f16757b;

    /* JADX INFO: renamed from: c */
    public final C3232kz f16758c;

    /* JADX INFO: renamed from: d */
    public final kg0 f16759d;

    public mh0(yl0 yl0Var, vk0 vk0Var, C3232kz c3232kz, kg0 kg0Var) {
        this.f16756a = yl0Var;
        this.f16757b = vk0Var;
        this.f16758c = c3232kz;
        this.f16759d = kg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final View m7700a() throws C3781zs {
        Object objM8802a = this.f16756a.m8802a(jw2.m7416H(), null, null);
        View view = (View) objM8802a;
        view.setVisibility(8);
        C2967dt c2967dt = (C2967dt) objM8802a;
        c2967dt.f13378f.mo6479f0("/sendMessageToSdk", new InterfaceC3464r8(this) { // from class: c.n.b.d.j.a.gh0

            /* JADX INFO: renamed from: a */
            public final mh0 f14579a;

            {
                this.f14579a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
            /* JADX INFO: renamed from: a */
            public final void mo6148a(Object obj, Map map) {
                this.f14579a.f16757b.m8564d("sendMessageToNativeJs", map);
            }
        });
        c2967dt.f13378f.mo6479f0("/adMuted", new InterfaceC3464r8(this) { // from class: c.n.b.d.j.a.hh0

            /* JADX INFO: renamed from: a */
            public final mh0 f14846a;

            {
                this.f14846a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
            /* JADX INFO: renamed from: a */
            public final void mo6148a(Object obj, Map map) {
                this.f14846a.f16759d.mo5759q();
            }
        });
        vk0 vk0Var = this.f16757b;
        vk0Var.m8562b("/loadHtml", new uk0(vk0Var, new WeakReference(objM8802a), "/loadHtml", new InterfaceC3464r8(this) { // from class: c.n.b.d.j.a.ih0

            /* JADX INFO: renamed from: a */
            public final mh0 f15183a;

            {
                this.f15183a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
            /* JADX INFO: renamed from: a */
            public final void mo6148a(Object obj, final Map map) {
                final mh0 mh0Var = this.f15183a;
                InterfaceC3410ps interfaceC3410ps = (InterfaceC3410ps) obj;
                ((C3670ws) interfaceC3410ps.mo6459O0()).f21331m = new InterfaceC2856au(mh0Var, map) { // from class: c.n.b.d.j.a.lh0

                    /* JADX INFO: renamed from: f */
                    public final mh0 f16355f;

                    /* JADX INFO: renamed from: g */
                    public final Map f16356g;

                    {
                        this.f16355f = mh0Var;
                        this.f16356g = map;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2856au
                    /* JADX INFO: renamed from: B */
                    public final void mo4670B(boolean z) {
                        mh0 mh0Var2 = this.f16355f;
                        Map map2 = this.f16356g;
                        Objects.requireNonNull(mh0Var2);
                        HashMap map3 = new HashMap();
                        map3.put("messageType", "htmlLoaded");
                        map3.put("id", (String) map2.get("id"));
                        mh0Var2.f16757b.m8564d("sendMessageToNativeJs", map3);
                    }
                };
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    interfaceC3410ps.loadData(str, "text/html", Utf8Charset.NAME);
                } else {
                    interfaceC3410ps.loadDataWithBaseURL(str2, str, "text/html", Utf8Charset.NAME, null);
                }
            }
        }));
        vk0 vk0Var2 = this.f16757b;
        vk0Var2.m8562b("/showOverlay", new uk0(vk0Var2, new WeakReference(objM8802a), "/showOverlay", new InterfaceC3464r8(this) { // from class: c.n.b.d.j.a.jh0

            /* JADX INFO: renamed from: a */
            public final mh0 f15595a;

            {
                this.f15595a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
            /* JADX INFO: renamed from: a */
            public final void mo6148a(Object obj, Map map) {
                mh0 mh0Var = this.f15595a;
                Objects.requireNonNull(mh0Var);
                C2622l.m5458x3("Showing native ads overlay.");
                ((InterfaceC3410ps) obj).mo6468X().setVisibility(0);
                mh0Var.f16758c.f16239k = true;
            }
        }));
        vk0 vk0Var3 = this.f16757b;
        vk0Var3.m8562b("/hideOverlay", new uk0(vk0Var3, new WeakReference(objM8802a), "/hideOverlay", new InterfaceC3464r8(this) { // from class: c.n.b.d.j.a.kh0

            /* JADX INFO: renamed from: a */
            public final mh0 f15942a;

            {
                this.f15942a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
            /* JADX INFO: renamed from: a */
            public final void mo6148a(Object obj, Map map) {
                mh0 mh0Var = this.f15942a;
                Objects.requireNonNull(mh0Var);
                C2622l.m5458x3("Hiding native ads overlay.");
                ((InterfaceC3410ps) obj).mo6468X().setVisibility(8);
                mh0Var.f16758c.f16239k = false;
            }
        }));
        return view;
    }
}
