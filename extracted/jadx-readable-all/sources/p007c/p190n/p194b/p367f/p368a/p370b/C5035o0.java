package p007c.p190n.p194b.p367f.p368a.p370b;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.f.a.b.o0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5035o0 implements InterfaceC5063w0 {

    /* JADX INFO: renamed from: a */
    public final C5066x0 f25894a;

    /* JADX INFO: renamed from: b */
    public final Bundle f25895b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25896c = 0;

    public C5035o0(C5066x0 c5066x0, Bundle bundle) {
        this.f25894a = c5066x0;
        this.f25895b = bundle;
    }

    public C5035o0(C5066x0 c5066x0, Bundle bundle, byte[] bArr) {
        this.f25894a = c5066x0;
        this.f25895b = bundle;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5063w0
    /* JADX INFO: renamed from: a */
    public final Object mo11466a() {
        boolean z = true;
        if (this.f25896c == 0) {
            C5066x0 c5066x0 = this.f25894a;
            Bundle bundle = this.f25895b;
            Objects.requireNonNull(c5066x0);
            int i = bundle.getInt("session_id");
            if (i != 0) {
                Map<Integer, C5057u0> map = c5066x0.f26004f;
                Integer numValueOf = Integer.valueOf(i);
                if (map.containsKey(numValueOf)) {
                    C5057u0 c5057u0 = c5066x0.f26004f.get(numValueOf);
                    return c5057u0.f25978c.f25960c == 6 ? Boolean.FALSE : Boolean.valueOf(!C4799a.m10969T(c5057u0.f25978c.f25960c, bundle.getInt(C4799a.m10951B("status", C5066x0.m11509d(bundle)))));
                }
            }
            return Boolean.TRUE;
        }
        C5066x0 c5066x1 = this.f25894a;
        Bundle bundle2 = this.f25895b;
        Objects.requireNonNull(c5066x1);
        int i2 = bundle2.getInt("session_id");
        if (i2 == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, C5057u0> map2 = c5066x1.f26004f;
        Integer numValueOf2 = Integer.valueOf(i2);
        if (map2.containsKey(numValueOf2)) {
            C5057u0 c5057u0M11512c = c5066x1.m11512c(i2);
            int i3 = bundle2.getInt(C4799a.m10951B("status", c5057u0M11512c.f25978c.f25958a));
            if (C4799a.m10969T(c5057u0M11512c.f25978c.f25960c, i3)) {
                C5066x0.f25999a.m11533b(3, "Found stale update for session %s with status %d.", new Object[]{numValueOf2, Integer.valueOf(c5057u0M11512c.f25978c.f25960c)});
                C5054t0 c5054t0 = c5057u0M11512c.f25978c;
                String str = c5054t0.f25958a;
                int i4 = c5054t0.f25960c;
                if (i4 == 4) {
                    c5066x1.f26001c.m11529a().mo11436d(i2, str);
                } else if (i4 == 5) {
                    c5066x1.f26001c.m11529a().mo11434b(i2);
                } else if (i4 == 6) {
                    c5066x1.f26001c.m11529a().mo11439g(Arrays.asList(str));
                }
            } else {
                c5057u0M11512c.f25978c.f25960c = i3;
                if (C4799a.m10958I(i3)) {
                    c5066x1.m11510a(i2);
                    c5066x1.f26002d.m11459a(c5057u0M11512c.f25978c.f25958a);
                } else {
                    for (C5060v0 c5060v0 : c5057u0M11512c.f25978c.f25962e) {
                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(C4799a.m10954E("chunk_intents", c5057u0M11512c.f25978c.f25958a, c5060v0.f25982a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (parcelableArrayList.get(i5) != null && ((Intent) parcelableArrayList.get(i5)).getData() != null) {
                                    c5060v0.f25985d.get(i5).f25949a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String strM11509d = C5066x0.m11509d(bundle2);
            long j2 = bundle2.getLong(C4799a.m10951B("pack_version", strM11509d));
            int i6 = bundle2.getInt(C4799a.m10951B("status", strM11509d));
            long j3 = bundle2.getLong(C4799a.m10951B("total_bytes_to_download", strM11509d));
            List<String> stringArrayList = bundle2.getStringArrayList(C4799a.m10951B("slice_ids", strM11509d));
            ArrayList arrayList = new ArrayList();
            if (stringArrayList == null) {
                stringArrayList = Collections.emptyList();
            }
            for (String str2 : stringArrayList) {
                List parcelableArrayList2 = bundle2.getParcelableArrayList(C4799a.m10954E("chunk_intents", strM11509d, str2));
                ArrayList arrayList2 = new ArrayList();
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = Collections.emptyList();
                }
                Iterator it = parcelableArrayList2.iterator();
                while (it.hasNext()) {
                    if (((Intent) it.next()) == null) {
                        z = false;
                    }
                    arrayList2.add(new C5051s0(z));
                    z = true;
                }
                String string = bundle2.getString(C4799a.m10954E("uncompressed_hash_sha256", strM11509d, str2));
                long j4 = bundle2.getLong(C4799a.m10954E("uncompressed_size", strM11509d, str2));
                int i7 = bundle2.getInt(C4799a.m10954E("patch_format", strM11509d, str2), 0);
                arrayList.add(i7 != 0 ? new C5060v0(str2, string, j4, arrayList2, 0, i7) : new C5060v0(str2, string, j4, arrayList2, bundle2.getInt(C4799a.m10954E("compression_format", strM11509d, str2), 0), 0));
                z = true;
            }
            c5066x1.f26004f.put(Integer.valueOf(i2), new C5057u0(i2, bundle2.getInt("app_version_code"), new C5054t0(strM11509d, j2, i6, j3, arrayList)));
        }
        return Boolean.TRUE;
    }
}
