package p007c.p190n.p385d.p386j.p387a;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p007c.p190n.p194b.p266d.p327k.p328a.C4444a;
import p007c.p190n.p385d.p386j.p387a.p388c.C5232b;
import p007c.p190n.p385d.p386j.p387a.p388c.C5233c;
import p007c.p190n.p385d.p386j.p387a.p388c.C5234d;

/* JADX INFO: renamed from: c.n.d.j.a.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C5230b implements InterfaceC5229a {

    /* JADX INFO: renamed from: a */
    public static volatile InterfaceC5229a f26326a;

    /* JADX INFO: renamed from: b */
    public final C4444a f26327b;

    /* JADX INFO: renamed from: c */
    public final Map<String, ?> f26328c;

    /* JADX INFO: renamed from: c.n.d.j.a.b$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
    public class a implements InterfaceC5229a.a {
        public a(C5230b c5230b, String str) {
        }
    }

    public C5230b(C4444a c4444a) {
        Objects.requireNonNull(c4444a, "null reference");
        this.f26327b = c4444a;
        this.f26328c = new ConcurrentHashMap();
    }

    @Override // p007c.p190n.p385d.p386j.p387a.InterfaceC5229a
    /* JADX INFO: renamed from: a */
    public void mo11676a(String str, String str2, Bundle bundle) {
        boolean z;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (C5233c.m11680a(str)) {
            boolean z2 = false;
            if (!C5233c.f26335b.contains(str2)) {
                Iterator<String> it = C5233c.f26337d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    } else if (bundle2.containsKey(it.next())) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (z) {
                if (!"_cmp".equals(str2)) {
                    z2 = true;
                    break;
                }
                if (C5233c.m11680a(str)) {
                    Iterator<String> it2 = C5233c.f26337d.iterator();
                    do {
                        if (!it2.hasNext()) {
                            byte b = -1;
                            int iHashCode = str.hashCode();
                            if (iHashCode != 101200) {
                                if (iHashCode != 101230) {
                                    if (iHashCode == 3142703 && str.equals("fiam")) {
                                        b = 2;
                                    }
                                } else if (str.equals("fdl")) {
                                    b = 1;
                                }
                            } else if (str.equals("fcm")) {
                                b = 0;
                            }
                            if (b == 0) {
                                bundle2.putString("_cis", "fcm_integration");
                            } else if (b == 1) {
                                bundle2.putString("_cis", "fdl_integration");
                            } else if (b != 2) {
                                break;
                            } else {
                                bundle2.putString("_cis", "fiam_integration");
                            }
                            z2 = true;
                            break;
                        }
                    } while (!bundle2.containsKey(it2.next()));
                }
                if (z2) {
                    if ("clx".equals(str) && "_ae".equals(str2)) {
                        bundle2.putLong("_r", 1L);
                    }
                    this.f26327b.f23687a.m9639e(str, str2, bundle2, true, true, null);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    @Override // p007c.p190n.p385d.p386j.p387a.InterfaceC5229a
    /* JADX INFO: renamed from: b */
    public void mo11677b(String str, String str2, Object obj) {
        if (C5233c.m11680a(str)) {
            boolean z = true;
            if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
                if (!str.equals("fcm") && !str.equals("frc")) {
                    z = false;
                    break;
                }
            } else if ("_ln".equals(str2)) {
                if (!str.equals("fcm") && !str.equals("fiam")) {
                    z = false;
                    break;
                }
            } else {
                if (C5233c.f26338e.contains(str2)) {
                    z = false;
                    break;
                }
                Iterator<String> it = C5233c.f26339f.iterator();
                while (it.hasNext()) {
                    if (str2.matches(it.next())) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                this.f26327b.m10371b(str, str2, obj);
            }
        }
    }

    @Override // p007c.p190n.p385d.p386j.p387a.InterfaceC5229a
    /* JADX INFO: renamed from: c */
    public InterfaceC5229a.a mo11678c(String str, InterfaceC5229a.b bVar) {
        Object c5234d;
        Objects.requireNonNull(bVar, "null reference");
        if (!C5233c.m11680a(str)) {
            return null;
        }
        if ((str.isEmpty() || !this.f26328c.containsKey(str) || this.f26328c.get(str) == null) ? false : true) {
            return null;
        }
        C4444a c4444a = this.f26327b;
        if ("fiam".equals(str)) {
            c5234d = new C5232b(c4444a, bVar);
        } else {
            c5234d = ("crash".equals(str) || "clx".equals(str)) ? new C5234d(c4444a, bVar) : null;
        }
        if (c5234d == null) {
            return null;
        }
        this.f26328c.put(str, c5234d);
        return new a(this, str);
    }
}
