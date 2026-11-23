package p007c.p190n.p194b.p266d.p327k.p329b;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2610f;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;
import p007c.p190n.p194b.p266d.p314j.p325k.C4286oa;
import p007c.p190n.p194b.p266d.p314j.p325k.C4326r8;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4312q8;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4316qc;

/* JADX INFO: renamed from: c.n.b.d.k.b.x9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4723x9 extends AbstractC4675t5 {

    /* JADX INFO: renamed from: c */
    public static final String[] f24588c = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: d */
    public static final String[] f24589d = {"_err"};

    /* JADX INFO: renamed from: e */
    public SecureRandom f24590e;

    /* JADX INFO: renamed from: f */
    public final AtomicLong f24591f;

    /* JADX INFO: renamed from: g */
    public int f24592g;

    /* JADX INFO: renamed from: h */
    public Integer f24593h;

    public C4723x9(C4707w4 c4707w4) {
        super(c4707w4);
        this.f24593h = null;
        this.f24591f = new AtomicLong(0L);
    }

    /* JADX INFO: renamed from: A */
    public static Bundle m10851A(List<C4712w9> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (C4712w9 c4712w9 : list) {
            String str = c4712w9.f24565j;
            if (str != null) {
                bundle.putString(c4712w9.f24562g, str);
            } else {
                Long l = c4712w9.f24564i;
                if (l != null) {
                    bundle.putLong(c4712w9.f24562g, l.longValue());
                } else {
                    Double d = c4712w9.f24567l;
                    if (d != null) {
                        bundle.putDouble(c4712w9.f24562g, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: E */
    public static String m10852E(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static void m10853F(Bundle bundle, int i, String str, Object obj) {
        if (m10863l0(bundle, i)) {
            bundle.putString("_ev", m10852E(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public static boolean m10854U(Context context) {
        Objects.requireNonNull(context, "null reference");
        return Build.VERSION.SDK_INT >= 24 ? m10862k0(context, "com.google.android.gms.measurement.AppMeasurementJobService") : m10862k0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* JADX INFO: renamed from: V */
    public static boolean m10855V(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* JADX INFO: renamed from: W */
    public static boolean m10856W(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: renamed from: X */
    public static boolean m10857X(String str) {
        C2622l.m5359e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m10858d0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return !TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m10859e0(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (m10864q0(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public static byte[] m10860g0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static ArrayList<Bundle> m10861j0(List<C4624oa> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C4624oa c4624oa : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c4624oa.f24238f);
            bundle.putString("origin", c4624oa.f24239g);
            bundle.putLong("creation_timestamp", c4624oa.f24241i);
            bundle.putString("name", c4624oa.f24240h.f24562g);
            C4340s8.m10214k(bundle, c4624oa.f24240h.m10847H());
            bundle.putBoolean("active", c4624oa.f24242j);
            String str = c4624oa.f24243k;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C4625p c4625p = c4624oa.f24244l;
            if (c4625p != null) {
                bundle.putString("timed_out_event_name", c4625p.f24249f);
                C4613o c4613o = c4624oa.f24244l.f24250g;
                if (c4613o != null) {
                    bundle.putBundle("timed_out_event_params", c4613o.m10702K());
                }
            }
            bundle.putLong("trigger_timeout", c4624oa.f24245m);
            C4625p c4625p2 = c4624oa.f24246n;
            if (c4625p2 != null) {
                bundle.putString("triggered_event_name", c4625p2.f24249f);
                C4613o c4613o2 = c4624oa.f24246n.f24250g;
                if (c4613o2 != null) {
                    bundle.putBundle("triggered_event_params", c4613o2.m10702K());
                }
            }
            bundle.putLong("triggered_timestamp", c4624oa.f24240h.f24563h);
            bundle.putLong("time_to_live", c4624oa.f24247o);
            C4625p c4625p3 = c4624oa.f24248p;
            if (c4625p3 != null) {
                bundle.putString("expired_event_name", c4625p3.f24249f);
                C4613o c4613o3 = c4624oa.f24248p.f24250g;
                if (c4613o3 != null) {
                    bundle.putBundle("expired_event_params", c4613o3.m10702K());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m10862k0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m10863l0(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public static boolean m10864q0(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m10865r0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: renamed from: u */
    public static long m10866u(long j2, long j3) {
        return ((j3 * 60000) + j2) / 86400000;
    }

    /* JADX INFO: renamed from: v */
    public static long m10867v(C4613o c4613o) {
        long length = 0;
        if (c4613o == null) {
            return 0L;
        }
        Iterator<String> it = c4613o.f24221f.keySet().iterator();
        while (it.hasNext()) {
            Object objM10701H = c4613o.m10701H(it.next());
            if (objM10701H instanceof Parcelable[]) {
                length += (long) ((Parcelable[]) objM10701H).length;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: w */
    public static long m10868w(byte[] bArr) {
        Objects.requireNonNull(bArr, "null reference");
        int i = 0;
        C2622l.m5384j(bArr.length > 0);
        long j2 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j2 += (((long) bArr[length]) & 255) << i;
            i += 8;
        }
        return j2;
    }

    /* JADX INFO: renamed from: x0 */
    public static MessageDigest m10869x0() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final C4625p m10870B(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m10901t(str2, z2) != 0) {
            mo10684l().f24418f.m10812b("Invalid conditional property event name", m10816e().m10721y(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleM10909z = m10909z(str, str2, bundle2, Collections.singletonList("_o"), false);
        if (z) {
            bundleM10909z = m10907y(bundleM10909z);
        }
        return new C4625p(str2, new C4613o(bundleM10909z), str3, j2);
    }

    /* JADX INFO: renamed from: C */
    public final Object m10871C(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m10852E(String.valueOf(obj), i, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleM10907y = m10907y((Bundle) parcelable);
                if (!bundleM10907y.isEmpty()) {
                    arrayList.add(bundleM10907y);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: D */
    public final Object m10872D(String str, Object obj) {
        if ("_ev".equals(str)) {
            return m10871C(256, obj, true, true);
        }
        return m10871C(m10865r0(str) ? 256 : 100, obj, false, true);
    }

    /* JADX INFO: renamed from: G */
    public final void m10873G(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            mo10684l().f24421i.m10812b("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    /* JADX INFO: renamed from: H */
    public final void m10874H(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                m10817f().m10875I(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m10875I(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            mo10684l().f24423k.m10813c("Not putting event parameter. Invalid value type. name, type", m10816e().m10720x(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m10876J(InterfaceC4316qc interfaceC4316qc, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            interfaceC4316qc.mo10100V(bundle);
        } catch (RemoteException e) {
            this.f24476a.mo10684l().f24421i.m10812b("Error returning int value to wrapper", e);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m10877K(InterfaceC4316qc interfaceC4316qc, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            interfaceC4316qc.mo10100V(bundle);
        } catch (RemoteException e) {
            this.f24476a.mo10684l().f24421i.m10812b("Error returning long value to wrapper", e);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m10878L(InterfaceC4316qc interfaceC4316qc, Bundle bundle) {
        try {
            interfaceC4316qc.mo10100V(bundle);
        } catch (RemoteException e) {
            this.f24476a.mo10684l().f24421i.m10812b("Error returning bundle value to wrapper", e);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m10879M(InterfaceC4316qc interfaceC4316qc, String str) {
        try {
            interfaceC4316qc.mo10100V(outline.m1575Z("r", str));
        } catch (RemoteException e) {
            this.f24476a.mo10684l().f24421i.m10812b("Error returning string value to wrapper", e);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m10880N(InterfaceC4316qc interfaceC4316qc, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC4316qc.mo10100V(bundle);
        } catch (RemoteException e) {
            this.f24476a.mo10684l().f24421i.m10812b("Error returning bundle list to wrapper", e);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m10881O(InterfaceC4316qc interfaceC4316qc, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            interfaceC4316qc.mo10100V(bundle);
        } catch (RemoteException e) {
            this.f24476a.mo10684l().f24421i.m10812b("Error returning boolean value to wrapper", e);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m10882P(InterfaceC4316qc interfaceC4316qc, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC4316qc.mo10100V(bundle);
        } catch (RemoteException e) {
            this.f24476a.mo10684l().f24421i.m10812b("Error returning byte array to wrapper", e);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m10883Q(C4706w3 c4706w3, int i) {
        int i2 = 0;
        for (String str : new TreeSet(c4706w3.f24518d.keySet())) {
            if (m10857X(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                mo10684l().f24420h.m10813c(sb.toString(), m10816e().m10718u(c4706w3.f24515a), m10816e().m10716s(c4706w3.f24518d));
                m10863l0(c4706w3.f24518d, 5);
                c4706w3.f24518d.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m10884R(InterfaceC4745z9 interfaceC4745z9, int i, String str, String str2, int i2) {
        m10885S(interfaceC4745z9, null, i, str, str2, i2);
    }

    /* JADX INFO: renamed from: S */
    public final void m10885S(InterfaceC4745z9 interfaceC4745z9, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m10863l0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        if (((InterfaceC4312q8) C4326r8.f23434f.zza()).zza() && this.f24476a.f24534h.m10417k(C4647r.f24325O0)) {
            interfaceC4745z9.mo10723F(str, bundle);
        } else {
            this.f24476a.m10836s().m10517H("auto", "_err", bundle);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m10886T(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int iM10903u0;
        int iM10899s;
        if (bundle == null) {
            return;
        }
        int i = 0;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str4)) {
                iM10903u0 = z ? m10903u0(str4) : 0;
                if (iM10903u0 == 0) {
                    iM10903u0 = m10905w0(str4);
                }
            } else {
                iM10903u0 = 0;
            }
            if (iM10903u0 != 0) {
                m10853F(bundle, iM10903u0, str4, iM10903u0 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (m10856W(bundle.get(str4))) {
                    mo10684l().f24423k.m10814d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str4);
                    iM10899s = 22;
                } else {
                    iM10899s = m10899s(str, str2, str4, bundle.get(str4), bundle, list, z, false);
                }
                if (iM10899s != 0 && !"_ev".equals(str4)) {
                    m10853F(bundle, iM10899s, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (m10857X(str4) && !m10859e0(str4, C4708w5.f24556d) && (i = i + 1) > 0) {
                    mo10684l().f24420h.m10813c("Item cannot contain custom parameters", m10816e().m10718u(str2), m10816e().m10716s(bundle));
                    m10863l0(bundle, 23);
                    bundle.remove(str4);
                }
            }
        }
    }

    @SuppressLint({"ApplySharedPref"})
    /* JADX INFO: renamed from: Y */
    public final boolean m10887Y(String str, double d) {
        try {
            SharedPreferences.Editor editorEdit = this.f24476a.f24528b.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return editorEdit.commit();
        } catch (Exception e) {
            mo10684l().f24418f.m10812b("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m10888Z(String str, int i, String str2) {
        if (str2 == null) {
            mo10684l().f24420h.m10812b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        mo10684l().f24420h.m10814d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m10889a0(String str, String str2) {
        if (str2 == null) {
            mo10684l().f24420h.m10812b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            mo10684l().f24420h.m10812b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            mo10684l().f24420h.m10813c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                mo10684l().f24420h.m10813c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m10890b0(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i) {
                mo10684l().f24423k.m10814d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m10891c0(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            Objects.requireNonNull(str, "null reference");
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (this.f24476a.m10839v()) {
                mo10684l().f24420h.m10812b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C4662s3.m10738s(str));
            }
            return false;
        }
        if (C4286oa.m10122a() && this.f24476a.f24534h.m10417k(C4647r.f24356j0) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f24476a.m10839v()) {
                mo10684l().f24420h.m10811a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        Objects.requireNonNull(str2, "null reference");
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        mo10684l().f24420h.m10812b("Invalid admob_app_id. Analytics disabled.", C4662s3.m10738s(str2));
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m10892f0(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z;
        if (str2 == null) {
            mo10684l().f24420h.m10812b("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = f24588c;
        int length = strArr3.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (str2.startsWith(strArr3[i])) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            mo10684l().f24420h.m10813c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr == null || !m10859e0(str2, strArr) || (strArr2 != null && m10859e0(str2, strArr2))) {
            return true;
        }
        mo10684l().f24420h.m10813c("Name is reserved. Type, name", str, str2);
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4675t5
    /* JADX INFO: renamed from: h */
    public final void mo10532h() {
        mo10381b();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                mo10684l().f24421i.m10811a("Utils falling back to Random for random id");
            }
        }
        this.f24591f.set(jNextLong);
    }

    /* JADX INFO: renamed from: h0 */
    public final int m10893h0(String str) {
        if (!m10895m0("user property", str)) {
            return 6;
        }
        if (m10892f0("user property", C4741z5.f24622a, null, str)) {
            return !m10888Z("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    /* JADX INFO: renamed from: i0 */
    public final int m10894i0(String str, Object obj) {
        return "_ldl".equals(str) ? m10890b0("user property referrer", str, m10910z0(str), obj) : m10890b0("user property", str, m10910z0(str), obj) ? 0 : 7;
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m10895m0(String str, String str2) {
        if (str2 == null) {
            mo10684l().f24420h.m10812b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            mo10684l().f24420h.m10812b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            mo10684l().f24420h.m10813c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                mo10684l().f24420h.m10813c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: n0 */
    public final Object m10896n0(String str, Object obj) {
        return "_ldl".equals(str) ? m10871C(m10910z0(str), obj, true, false) : m10871C(m10910z0(str), obj, false, false);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m10897o0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = C2794c.m5637a(context).f11958a.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            mo10684l().f24418f.m10812b("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            mo10684l().f24418f.m10812b("Error obtaining certificate", e2);
            return true;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m10898p0(String str) {
        mo10381b();
        if (C2794c.m5637a(this.f24476a.f24528b).f11958a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        mo10684l().f24425m.m10812b("Permission not granted", str);
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4675t5
    /* JADX INFO: renamed from: r */
    public final boolean mo10533r() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX INFO: renamed from: s */
    public final int m10899s(String str, String str2, String str3, Object obj, Bundle bundle, List<String> list, boolean z, boolean z2) {
        int i;
        int size;
        boolean z3;
        ArrayList arrayList;
        Parcelable[] parcelableArr;
        mo10381b();
        boolean z4 = true;
        if (!m10856W(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!m10859e0(str3, C4708w5.f24555c)) {
                return 20;
            }
            C4677t7 c4677t7M10841x = this.f24476a.m10841x();
            c4677t7M10841x.mo10381b();
            c4677t7M10841x.m10479t();
            if (!(!c4677t7M10841x.m10773G() || c4677t7M10841x.m10817f().m10908y0() >= 200900)) {
                return 25;
            }
            boolean z5 = obj instanceof Parcelable[];
            if (z5) {
                size = ((Parcelable[]) obj).length;
            } else {
                if (obj instanceof ArrayList) {
                    size = ((ArrayList) obj).size();
                } else {
                    z3 = true;
                }
                if (z3) {
                    i = 0;
                } else {
                    if (z5) {
                        parcelableArr = (Parcelable[]) obj;
                        if (parcelableArr.length > 200) {
                            bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                        }
                    } else if (obj instanceof ArrayList) {
                        arrayList = (ArrayList) obj;
                        if (arrayList.size() > 200) {
                            bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                        }
                    }
                    i = 17;
                }
            }
            if (size > 200) {
                mo10684l().f24423k.m10814d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                if (z5) {
                    parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i = 17;
            } else {
                i = 0;
            }
        }
        if (m10890b0("param", str3, ((this.f24476a.f24534h.m10423u(str, C4647r.f24328R) && m10865r0(str2)) || m10865r0(str3)) ? 256 : 100, obj)) {
            return i;
        }
        if (!z2) {
            return 4;
        }
        if (obj instanceof Bundle) {
            m10886T(str, str2, str3, (Bundle) obj, list, z);
        } else if (!(obj instanceof Parcelable[])) {
            if (!(obj instanceof ArrayList)) {
                z4 = false;
                break;
            }
            ArrayList arrayList2 = (ArrayList) obj;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                int i3 = i2 + 1;
                if (!(obj2 instanceof Bundle)) {
                    mo10684l().f24423k.m10813c("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str3);
                    z4 = false;
                    break;
                }
                m10886T(str, str2, str3, (Bundle) obj2, list, z);
                i2 = i3;
            }
        } else {
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (!(parcelable instanceof Bundle)) {
                    mo10684l().f24423k.m10813c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                    z4 = false;
                    break;
                }
                m10886T(str, str2, str3, (Bundle) parcelable, list, z);
            }
        }
        if (z4) {
            return i;
        }
        return 4;
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m10900s0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f24476a.f24534h.m10414d("debug.firebase.analytics.app", "").equals(str);
    }

    /* JADX INFO: renamed from: t */
    public final int m10901t(String str, boolean z) {
        if (!m10895m0("event", str)) {
            return 2;
        }
        if (z) {
            if (!m10892f0("event", C4719x5.f24577a, C4719x5.f24578b, str)) {
                return 13;
            }
        } else if (!m10892f0("event", C4719x5.f24577a, null, str)) {
            return 13;
        }
        return !m10888Z("event", 40, str) ? 2 : 0;
    }

    /* JADX INFO: renamed from: t0 */
    public final long m10902t0() {
        long andIncrement;
        long j2;
        if (this.f24591f.get() != 0) {
            synchronized (this.f24591f) {
                this.f24591f.compareAndSet(-1L, 1L);
                andIncrement = this.f24591f.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f24591f) {
            long jNextLong = new Random(System.nanoTime() ^ this.f24476a.f24541o.mo5623c()).nextLong();
            int i = this.f24592g + 1;
            this.f24592g = i;
            j2 = jNextLong + ((long) i);
        }
        return j2;
    }

    /* JADX INFO: renamed from: u0 */
    public final int m10903u0(String str) {
        if (!m10889a0("event param", str)) {
            return 3;
        }
        if (m10892f0("event param", null, null, str)) {
            return !m10888Z("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    /* JADX INFO: renamed from: v0 */
    public final SecureRandom m10904v0() {
        mo10381b();
        if (this.f24590e == null) {
            this.f24590e = new SecureRandom();
        }
        return this.f24590e;
    }

    /* JADX INFO: renamed from: w0 */
    public final int m10905w0(String str) {
        if (!m10895m0("event param", str)) {
            return 3;
        }
        if (m10892f0("event param", null, null, str)) {
            return !m10888Z("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    /* JADX INFO: renamed from: x */
    public final Bundle m10906x(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("term", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("content", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("aclid", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("cp1", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("anid", queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo10684l().f24421i.m10812b("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public final Bundle m10907y(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM10872D = m10872D(str, bundle.get(str));
                if (objM10872D == null) {
                    mo10684l().f24423k.m10812b("Param value can't be null", m10816e().m10720x(str));
                } else {
                    m10875I(bundle2, str, objM10872D);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: y0 */
    public final int m10908y0() {
        if (this.f24593h == null) {
            this.f24593h = Integer.valueOf(C2610f.f11568b.m5212a(this.f24476a.f24528b) / CloseCodes.NORMAL_CLOSURE);
        }
        return this.f24593h.intValue();
    }

    /* JADX INFO: renamed from: z */
    public final Bundle m10909z(String str, String str2, Bundle bundle, List list, boolean z) {
        int iM10903u0;
        int i;
        C4723x9 c4723x9 = this;
        boolean zM10859e0 = m10859e0(str2, C4719x5.f24580d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int iM10422t = c4723x9.f24476a.f24534h.m10422t();
        int i2 = 0;
        for (String str3 : c4723x9.f24476a.f24534h.m10423u(str, C4647r.f24336Z) ? new TreeSet<>(bundle.keySet()) : bundle.keySet()) {
            if (list == null || !list.contains(str3)) {
                iM10903u0 = z ? c4723x9.m10903u0(str3) : 0;
                if (iM10903u0 == 0) {
                    iM10903u0 = c4723x9.m10905w0(str3);
                }
            } else {
                iM10903u0 = 0;
            }
            if (iM10903u0 != 0) {
                m10853F(bundle2, iM10903u0, str3, iM10903u0 == 3 ? str3 : null);
                bundle2.remove(str3);
                i = iM10422t;
            } else {
                i = iM10422t;
                int iM10899s = m10899s(str, str2, str3, bundle.get(str3), bundle2, list, z, zM10859e0);
                if (iM10899s == 17) {
                    m10853F(bundle2, iM10899s, str3, Boolean.FALSE);
                } else if (iM10899s != 0 && !"_ev".equals(str3)) {
                    m10853F(bundle2, iM10899s, iM10899s == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (m10857X(str3)) {
                    int i3 = i2 + 1;
                    if (i3 > i) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Event can't contain more than ");
                        sb.append(i);
                        sb.append(" params");
                        mo10684l().f24420h.m10813c(sb.toString(), m10816e().m10718u(str2), m10816e().m10716s(bundle));
                        m10863l0(bundle2, 5);
                        bundle2.remove(str3);
                        i2 = i3;
                    } else {
                        i2 = i3;
                    }
                }
                iM10422t = i;
                c4723x9 = this;
            }
            iM10422t = i;
            c4723x9 = this;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: z0 */
    public final int m10910z0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (this.f24476a.f24534h.m10417k(C4647r.f24352h0) && "_lgclid".equals(str)) ? 100 : 36;
    }
}
