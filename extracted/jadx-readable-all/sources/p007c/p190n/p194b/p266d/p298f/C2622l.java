package p007c.p190n.p194b.p266d.p298f;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p191a.EnumC1252a;
import p007c.p190n.p191a.EnumC1253b;
import p007c.p190n.p191a.p192d.C1255a;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2292q;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g;
import p007c.p190n.p194b.p266d.p298f.p299o.C2629b;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.C2768b;
import p007c.p190n.p194b.p266d.p298f.p305s.InterfaceC2776a;
import p007c.p190n.p194b.p266d.p298f.p309v.C2793b;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C2962do;
import p007c.p190n.p194b.p266d.p314j.p315a.C2979e4;
import p007c.p190n.p194b.p266d.p314j.p315a.C2998en;
import p007c.p190n.p194b.p266d.p314j.p315a.C2999eo;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3108hm;
import p007c.p190n.p194b.p266d.p314j.p315a.C3282mb;
import p007c.p190n.p194b.p266d.p314j.p315a.C3422q3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3533t3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3609v4;
import p007c.p190n.p194b.p266d.p314j.p315a.C3628vn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3675wx;
import p007c.p190n.p194b.p266d.p314j.p315a.C3696xh;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3590un;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3615va;
import p007c.p190n.p194b.p266d.p314j.p315a.a60;
import p007c.p190n.p194b.p266d.p314j.p315a.af1;
import p007c.p190n.p194b.p266d.p314j.p315a.ak1;
import p007c.p190n.p194b.p266d.p314j.p315a.ba0;
import p007c.p190n.p194b.p266d.p314j.p315a.ba2;
import p007c.p190n.p194b.p266d.p314j.p315a.bf1;
import p007c.p190n.p194b.p266d.p314j.p315a.cb2;
import p007c.p190n.p194b.p266d.p314j.p315a.cx1;
import p007c.p190n.p194b.p266d.p314j.p315a.cz1;
import p007c.p190n.p194b.p266d.p314j.p315a.di1;
import p007c.p190n.p194b.p266d.p314j.p315a.dw1;
import p007c.p190n.p194b.p266d.p314j.p315a.dx1;
import p007c.p190n.p194b.p266d.p314j.p315a.e11;
import p007c.p190n.p194b.p266d.p314j.p315a.e32;
import p007c.p190n.p194b.p266d.p314j.p315a.e82;
import p007c.p190n.p194b.p266d.p314j.p315a.eb0;
import p007c.p190n.p194b.p266d.p314j.p315a.el1;
import p007c.p190n.p194b.p266d.p314j.p315a.er1;
import p007c.p190n.p194b.p266d.p314j.p315a.ev1;
import p007c.p190n.p194b.p266d.p314j.p315a.ew2;
import p007c.p190n.p194b.p266d.p314j.p315a.f31;
import p007c.p190n.p194b.p266d.p314j.p315a.f32;
import p007c.p190n.p194b.p266d.p314j.p315a.fb0;
import p007c.p190n.p194b.p266d.p314j.p315a.fs1;
import p007c.p190n.p194b.p266d.p314j.p315a.g22;
import p007c.p190n.p194b.p266d.p314j.p315a.g72;
import p007c.p190n.p194b.p266d.p314j.p315a.g82;
import p007c.p190n.p194b.p266d.p314j.p315a.gn1;
import p007c.p190n.p194b.p266d.p314j.p315a.gw1;
import p007c.p190n.p194b.p266d.p314j.p315a.gx0;
import p007c.p190n.p194b.p266d.p314j.p315a.h32;
import p007c.p190n.p194b.p266d.p314j.p315a.h82;
import p007c.p190n.p194b.p266d.p314j.p315a.hj2;
import p007c.p190n.p194b.p266d.p314j.p315a.hw1;
import p007c.p190n.p194b.p266d.p314j.p315a.hx0;
import p007c.p190n.p194b.p266d.p314j.p315a.ii1;
import p007c.p190n.p194b.p266d.p314j.p315a.iw1;
import p007c.p190n.p194b.p266d.p314j.p315a.jd2;
import p007c.p190n.p194b.p266d.p314j.p315a.jj1;
import p007c.p190n.p194b.p266d.p314j.p315a.jo2;
import p007c.p190n.p194b.p266d.p314j.p315a.jw2;
import p007c.p190n.p194b.p266d.p314j.p315a.k32;
import p007c.p190n.p194b.p266d.p314j.p315a.ke2;
import p007c.p190n.p194b.p266d.p314j.p315a.kv1;
import p007c.p190n.p194b.p266d.p314j.p315a.l42;
import p007c.p190n.p194b.p266d.p314j.p315a.l92;
import p007c.p190n.p194b.p266d.p314j.p315a.lf1;
import p007c.p190n.p194b.p266d.p314j.p315a.ls1;
import p007c.p190n.p194b.p266d.p314j.p315a.lv1;
import p007c.p190n.p194b.p266d.p314j.p315a.lv2;
import p007c.p190n.p194b.p266d.p314j.p315a.m20;
import p007c.p190n.p194b.p266d.p314j.p315a.me1;
import p007c.p190n.p194b.p266d.p314j.p315a.mt0;
import p007c.p190n.p194b.p266d.p314j.p315a.n92;
import p007c.p190n.p194b.p266d.p314j.p315a.nj1;
import p007c.p190n.p194b.p266d.p314j.p315a.np1;
import p007c.p190n.p194b.p266d.p314j.p315a.nq1;
import p007c.p190n.p194b.p266d.p314j.p315a.nw1;
import p007c.p190n.p194b.p266d.p314j.p315a.o50;
import p007c.p190n.p194b.p266d.p314j.p315a.o82;
import p007c.p190n.p194b.p266d.p314j.p315a.ol1;
import p007c.p190n.p194b.p266d.p314j.p315a.on1;
import p007c.p190n.p194b.p266d.p314j.p315a.or0;
import p007c.p190n.p194b.p266d.p314j.p315a.ot1;
import p007c.p190n.p194b.p266d.p314j.p315a.p82;
import p007c.p190n.p194b.p266d.p314j.p315a.pa2;
import p007c.p190n.p194b.p266d.p314j.p315a.pl1;
import p007c.p190n.p194b.p266d.p314j.p315a.q30;
import p007c.p190n.p194b.p266d.p314j.p315a.q62;
import p007c.p190n.p194b.p266d.p314j.p315a.qe1;
import p007c.p190n.p194b.p266d.p314j.p315a.qn1;
import p007c.p190n.p194b.p266d.p314j.p315a.r22;
import p007c.p190n.p194b.p266d.p314j.p315a.r32;
import p007c.p190n.p194b.p266d.p314j.p315a.r50;
import p007c.p190n.p194b.p266d.p314j.p315a.r82;
import p007c.p190n.p194b.p266d.p314j.p315a.rd2;
import p007c.p190n.p194b.p266d.p314j.p315a.rj1;
import p007c.p190n.p194b.p266d.p314j.p315a.rn1;
import p007c.p190n.p194b.p266d.p314j.p315a.rw1;
import p007c.p190n.p194b.p266d.p314j.p315a.s22;
import p007c.p190n.p194b.p266d.p314j.p315a.s32;
import p007c.p190n.p194b.p266d.p314j.p315a.s72;
import p007c.p190n.p194b.p266d.p314j.p315a.se1;
import p007c.p190n.p194b.p266d.p314j.p315a.sh1;
import p007c.p190n.p194b.p266d.p314j.p315a.sp1;
import p007c.p190n.p194b.p266d.p314j.p315a.sw1;
import p007c.p190n.p194b.p266d.p314j.p315a.tp1;
import p007c.p190n.p194b.p266d.p314j.p315a.tw1;
import p007c.p190n.p194b.p266d.p314j.p315a.u01;
import p007c.p190n.p194b.p266d.p314j.p315a.uw1;
import p007c.p190n.p194b.p266d.p314j.p315a.w62;
import p007c.p190n.p194b.p266d.p314j.p315a.ws0;
import p007c.p190n.p194b.p266d.p314j.p315a.x12;
import p007c.p190n.p194b.p266d.p314j.p315a.ye1;
import p007c.p190n.p194b.p266d.p314j.p315a.yl1;
import p007c.p190n.p194b.p266d.p314j.p315a.yt0;
import p007c.p190n.p194b.p266d.p314j.p315a.yv2;
import p007c.p190n.p194b.p266d.p314j.p315a.zf2;
import p007c.p190n.p194b.p266d.p314j.p315a.zj1;
import p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3823b4;
import p007c.p190n.p194b.p266d.p314j.p320f.AbstractC4057z4;
import p007c.p190n.p194b.p266d.p314j.p320f.C3814a5;
import p007c.p190n.p194b.p266d.p314j.p320f.C3893i4;
import p007c.p190n.p194b.p266d.p314j.p320f.C3916k7;
import p007c.p190n.p194b.p266d.p314j.p320f.C3936m7;
import p007c.p190n.p194b.p266d.p314j.p320f.C4007u;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3895i6;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3998t;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4099b5;
import p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4402x3;
import p007c.p190n.p194b.p266d.p314j.p325k.C4126d4;
import p007c.p190n.p194b.p266d.p314j.p325k.C4127d5;
import p007c.p190n.p194b.p266d.p314j.p325k.C4139e3;
import p007c.p190n.p194b.p266d.p314j.p325k.C4141e5;
import p007c.p190n.p194b.p266d.p314j.p325k.C4167g3;
import p007c.p190n.p194b.p266d.p314j.p325k.C4227k7;
import p007c.p190n.p194b.p266d.p314j.p325k.C4239l5;
import p007c.p190n.p194b.p266d.p314j.p325k.C4255m7;
import p007c.p190n.p194b.p266d.p314j.p325k.C4268n6;
import p007c.p190n.p194b.p266d.p314j.p325k.C4367u7;
import p007c.p190n.p194b.p266d.p314j.p325k.C4389w3;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4125d3;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4166g2;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4197i5;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4240l6;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4431z6;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.C4778g0;
import p007c.p190n.p194b.p266d.p333n.C4783k;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4773e;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4775f;
import p636z0.p691g.ArraySet2;

/* JADX INFO: renamed from: c.n.b.d.f.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2622l {

    /* JADX INFO: renamed from: a */
    public static InterfaceC2776a f11593a;

    /* JADX INFO: renamed from: b */
    public static Boolean f11594b;

    /* JADX INFO: renamed from: c */
    public static Boolean f11595c;

    /* JADX INFO: renamed from: d */
    public static Boolean f11596d;

    /* JADX INFO: renamed from: e */
    public static Boolean f11597e;

    /* JADX INFO: renamed from: f */
    public static String f11598f;

    /* JADX INFO: renamed from: A */
    public static boolean m5222A() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* JADX INFO: renamed from: A0 */
    public static <T> InterfaceC4125d3<T> m5223A0(InterfaceC4125d3<T> interfaceC4125d3) {
        if ((interfaceC4125d3 instanceof C4167g3) || (interfaceC4125d3 instanceof C4139e3)) {
            return interfaceC4125d3;
        }
        return interfaceC4125d3 instanceof Serializable ? new C4139e3(interfaceC4125d3) : new C4167g3(interfaceC4125d3);
    }

    /* JADX INFO: renamed from: A1 */
    public static final String m5224A1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: A2 */
    public static final void m5225A2(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static void m5226A3(String str) {
        if (m5281L3(5)) {
            Log.w("Ads", str);
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m5227B(@RecentlyNonNull Context context, int i) {
        if (!m5287N(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            C2620k c2620kM5218a = C2620k.m5218a(context);
            Objects.requireNonNull(c2620kM5218a);
            if (packageInfo == null) {
                return false;
            }
            if (!C2620k.m5220d(packageInfo, false)) {
                if (!C2620k.m5220d(packageInfo, true)) {
                    return false;
                }
                if (!C2618j.m5216b(c2620kM5218a.f11588b)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static File m5228B0(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(m5422q2(str, file), str2);
    }

    /* JADX INFO: renamed from: B1 */
    public static int m5229B1(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: B2 */
    public static void m5230B2(List<String> list, C2979e4<String> c2979e4) {
        String strM6603d = c2979e4.m6603d();
        if (TextUtils.isEmpty(strM6603d)) {
            return;
        }
        list.add(strM6603d);
    }

    /* JADX INFO: renamed from: B3 */
    public static int m5231B3(ba2 ba2Var, byte[] bArr, int i, int i2, int i3, w62 w62Var) throws IOException {
        n92 n92Var = (n92) ba2Var;
        Object objZza = n92Var.zza();
        int iM7793E = n92Var.m7793E(objZza, bArr, i, i2, i3, w62Var);
        n92Var.mo5952h(objZza);
        w62Var.f21011c = objZza;
        return iM7793E;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m5232C(@RecentlyNonNull Context context) {
        if (f11596d == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f11596d = Boolean.valueOf(z);
        }
        return f11596d.booleanValue();
    }

    /* JADX INFO: renamed from: C0 */
    public static <T> T m5233C0(Context context, String str, InterfaceC3590un<IBinder, T> interfaceC3590un) throws C3628vn {
        try {
            try {
                return interfaceC3590un.mo6228a(DynamiteModule.m12666d(context, DynamiteModule.f28674a, ModuleDescriptor.MODULE_ID).m12673c(str));
            } catch (Exception e) {
                throw new C3628vn(e);
            }
        } catch (Exception e2) {
            throw new C3628vn(e2);
        }
    }

    /* JADX INFO: renamed from: C1 */
    public static int m5234C1(int i, byte[] bArr, int i2, w62 w62Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            w62Var.f21009a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            w62Var.f21009a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            w62Var.f21009a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            w62Var.f21009a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                w62Var.f21009a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: C2 */
    public static final void m5235C2(byte[] bArr, String str, Context context, np1 np1Var) {
        if (np1Var == null) {
            return;
        }
        StringBuilder sbM1556G = outline.m1556G("os.arch:");
        sbM1556G.append(System.getProperty("os.arch"));
        sbM1556G.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sbM1556G.append("supported_abis:");
                sbM1556G.append(Arrays.toString(strArr));
                sbM1556G.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sbM1556G.append("CPU_ABI:");
        sbM1556G.append(Build.CPU_ABI);
        sbM1556G.append(";CPU_ABI2:");
        sbM1556G.append(Build.CPU_ABI2);
        sbM1556G.append(";");
        if (bArr != null) {
            sbM1556G.append("ELF:");
            sbM1556G.append(Arrays.toString(bArr));
            sbM1556G.append(";");
        }
        if (str != null) {
            sbM1556G.append("dbg:");
            sbM1556G.append(str);
            sbM1556G.append(";");
        }
        np1Var.m7916e(4007, sbM1556G.toString());
    }

    /* JADX INFO: renamed from: C3 */
    public static ByteBuffer m5236C3(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(outline.m1585g(93, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return m5468z3(byteBuffer, i);
        }
        throw new IOException(outline.m1586h(101, "Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ", byteBuffer.remaining()));
    }

    @TargetApi(20)
    /* JADX INFO: renamed from: D */
    public static boolean m5237D(@RecentlyNonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f11594b == null) {
            f11594b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f11594b.booleanValue();
    }

    /* JADX INFO: renamed from: D0 */
    public static <T> T m5238D0(ls1<T> ls1Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return ls1Var.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: D1 */
    public static int m5239D1(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: D2 */
    public static X509Certificate[] m5240D2(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws IOException, SecurityException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferM5236C3 = m5236C3(byteBuffer);
        ByteBuffer byteBufferM5236C4 = m5236C3(byteBuffer);
        byte[] bArrM5256G3 = m5256G3(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrM5256G4 = null;
        int i = -1;
        int i2 = 0;
        byte[] bArrM5256G5 = null;
        while (byteBufferM5236C4.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferM5236C5 = m5236C3(byteBufferM5236C4);
                if (byteBufferM5236C5.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferM5236C5.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iM5388j3 = m5388j3(i3);
                    int iM5388j4 = m5388j3(i);
                    if (iM5388j3 != 1 && iM5388j4 == 1) {
                    }
                }
                bArrM5256G5 = m5256G3(byteBufferM5236C5);
                i = i3;
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException(outline.m1585g(45, "Failed to parse signature record #", i2), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    String strValueOf = String.valueOf(Long.toHexString(i));
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf) : new String("Unknown signature algorithm: 0x"));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    String strValueOf2 = String.valueOf(Long.toHexString(i));
                    throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf2) : new String("Unknown signature algorithm: 0x"));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrM5256G3));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferM5236C3);
            if (!signature.verify(bArrM5256G5)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferM5236C3.clear();
            ByteBuffer byteBufferM5236C6 = m5236C3(byteBufferM5236C3);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (byteBufferM5236C6.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferM5236C7 = m5236C3(byteBufferM5236C6);
                    if (byteBufferM5236C7.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferM5236C7.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrM5256G4 = m5256G3(byteBufferM5236C7);
                    }
                } catch (IOException | BufferUnderflowException e2) {
                    throw new IOException(outline.m1585g(42, "Failed to parse digest record #", i4), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iM5388j5 = m5388j3(i);
            byte[] bArrPut = map.put(Integer.valueOf(iM5388j5), bArrM5256G4);
            if (bArrPut != null && !MessageDigest.isEqual(bArrPut, bArrM5256G4)) {
                throw new SecurityException(m5423q3(iM5388j5).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferM5236C8 = m5236C3(byteBufferM5236C3);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferM5236C8.hasRemaining()) {
                i6++;
                byte[] bArrM5256G6 = m5256G3(byteBufferM5236C8);
                try {
                    arrayList3.add(new ke2((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrM5256G6)), bArrM5256G6));
                } catch (CertificateException e3) {
                    throw new SecurityException(outline.m1585g(41, "Failed to decode certificate #", i6), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrM5256G3, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            throw new SecurityException(outline.m1552C(new StringBuilder(String.valueOf(str2).length() + 27), "Failed to verify ", str2, " signature"), e4);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public static void m5241D3(String str, Throwable th) {
        if (m5281L3(5)) {
            Log.w("Ads", str, th);
        }
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: E */
    public static boolean m5242E(@RecentlyNonNull Context context) {
        if (!m5237D(context)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return m5381i1(context) && !m5464z();
        }
        return true;
    }

    /* JADX INFO: renamed from: E0 */
    public static <V> V m5243E0(InterfaceC4166g2<V> interfaceC4166g2) {
        try {
            return interfaceC4166g2.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC4166g2.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    /* JADX INFO: renamed from: E1 */
    public static int m5244E1(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        int i2 = i << 8;
        int i3 = byteBuffer.get();
        if (i3 < 0) {
            i3 += 256;
        }
        return i2 + i3;
    }

    /* JADX INFO: renamed from: E2 */
    public static int m5245E2(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: E3 */
    public static int m5246E3(int i, byte[] bArr, int i2, int i3, o82<?> o82Var, w62 w62Var) {
        h82 h82Var = (h82) o82Var;
        int iM5390k0 = m5390k0(bArr, i2, w62Var);
        h82Var.m7102j(w62Var.f21009a);
        while (iM5390k0 < i3) {
            int iM5390k1 = m5390k0(bArr, iM5390k0, w62Var);
            if (i != w62Var.f21009a) {
                break;
            }
            iM5390k0 = m5390k0(bArr, iM5390k1, w62Var);
            h82Var.m7102j(w62Var.f21009a);
        }
        return iM5390k0;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m5247F(@RecentlyNonNull Parcel parcel, int i) {
        m5316U0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: F0 */
    public static <T> T m5248F0(Callable<T> callable) throws Exception {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public static int m5249F1(byte[] bArr, int i, C4389w3 c4389w3) {
        int i2 = i + 1;
        long j2 = bArr[i];
        if (j2 >= 0) {
            c4389w3.f23584b = j2;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = (j2 & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c4389w3.f23584b = j3;
        return i3;
    }

    /* JADX INFO: renamed from: F2 */
    public static int m5250F2(int i, int i2, @NullableDecl String str) {
        String strM5302Q2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM5302Q2 = m5302Q2("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new IllegalArgumentException(outline.m1585g(26, "negative size: ", i2));
            }
            strM5302Q2 = m5302Q2("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM5302Q2);
    }

    /* JADX INFO: renamed from: F3 */
    public static String m5251F3(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    /* JADX INFO: renamed from: G */
    public static double m5252G(@RecentlyNonNull Parcel parcel, int i) {
        m5316U0(parcel, i, 8);
        return parcel.readDouble();
    }

    /* JADX INFO: renamed from: G0 */
    public static <V> V m5253G0(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: renamed from: G1 */
    public static long m5254G1(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                C3282mb.m7680a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", C3282mb.m7683d("Unable to parse dateStr: %s, falling back to 0", str), e);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: G2 */
    public static int m5255G2(x12 x12Var) throws GeneralSecurityException {
        int iOrdinal = x12Var.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                String strValueOf = String.valueOf(x12Var);
                throw new GeneralSecurityException(outline.m1550A(new StringBuilder(strValueOf.length() + 22), "unknown point format: ", strValueOf));
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: G3 */
    public static byte[] m5256G3(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new IOException(outline.m1586h(90, "Underflow while reading length-prefixed value. Length: ", i, ", available: ", byteBuffer.remaining()));
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: H */
    public static float m5257H(@RecentlyNonNull Parcel parcel, int i) {
        m5316U0(parcel, i, 4);
        return parcel.readFloat();
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ String m5258H0(int i) {
        switch (i) {
            case 1:
                return "PLATFORM_VERSION_TOO_LOW";
            case 2:
                return "CONTEXT_NOT_AN_ACTIVITY";
            case 3:
                return "CONTEXT_NULL";
            case 4:
                return "CCT_NOT_SUPPORTED";
            case 5:
                return "CCT_READY_TO_OPEN";
            case 6:
                return "ACTIVITY_NOT_FOUND";
            case 7:
                return "EMPTY_URL";
            case 8:
                return "UNKNOWN";
            default:
                return "WRONG_EXP_SETUP";
        }
    }

    /* JADX INFO: renamed from: H1 */
    public static long m5259H1(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    /* JADX INFO: renamed from: H2 */
    public static int m5260H2(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: H3 */
    public static int m5261H3(byte[] bArr, int i, o82<?> o82Var, w62 w62Var) throws IOException {
        h82 h82Var = (h82) o82Var;
        int iM5390k0 = m5390k0(bArr, i, w62Var);
        int i2 = w62Var.f21009a + iM5390k0;
        while (iM5390k0 < i2) {
            iM5390k0 = m5390k0(bArr, iM5390k0, w62Var);
            h82Var.m7102j(w62Var.f21009a);
        }
        if (iM5390k0 == i2) {
            return iM5390k0;
        }
        throw r82.m8260a();
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: I */
    public static IBinder m5262I(@RecentlyNonNull Parcel parcel, int i) {
        int iM5277L = m5277L(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM5277L == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM5277L);
        return strongBinder;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX INFO: renamed from: I0 */
    public static String m5263I0(Context context) {
        String str = f11598f;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f11598f = null;
        } else if (arrayList.size() == 1) {
            f11598f = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(str2)) {
            try {
                List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                if (listQueryIntentActivities2 != null && listQueryIntentActivities2.size() != 0) {
                    Iterator<ResolveInfo> it = listQueryIntentActivities2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ResolveInfo next = it.next();
                            IntentFilter intentFilter = next.filter;
                            if (intentFilter == null || intentFilter.countDataAuthorities() == 0 || intentFilter.countDataPaths() == 0 || next.activityInfo == null) {
                            }
                        } else if (arrayList.contains(str2)) {
                            f11598f = str2;
                        }
                        if (arrayList.contains("com.android.chrome")) {
                            f11598f = "com.android.chrome";
                        } else if (arrayList.contains("com.chrome.beta")) {
                            f11598f = "com.chrome.beta";
                        } else if (arrayList.contains("com.chrome.dev")) {
                            f11598f = "com.chrome.dev";
                        } else if (arrayList.contains("com.google.android.apps.chrome")) {
                            f11598f = "com.google.android.apps.chrome";
                        }
                    }
                } else if (arrayList.contains(str2)) {
                    f11598f = str2;
                } else if (arrayList.contains("com.android.chrome")) {
                    f11598f = "com.android.chrome";
                } else if (arrayList.contains("com.chrome.beta")) {
                    f11598f = "com.chrome.beta";
                } else if (arrayList.contains("com.chrome.dev")) {
                    f11598f = "com.chrome.dev";
                } else if (arrayList.contains("com.google.android.apps.chrome")) {
                    f11598f = "com.google.android.apps.chrome";
                }
            } catch (RuntimeException unused) {
                Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
            }
        } else if (arrayList.contains("com.android.chrome")) {
            f11598f = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            f11598f = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            f11598f = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            f11598f = "com.google.android.apps.chrome";
        }
        return f11598f;
    }

    /* JADX INFO: renamed from: I1 */
    public static C1255a m5264I1(ew2 ew2Var, boolean z) {
        EnumC1253b enumC1253b;
        List<String> list = ew2Var.f13717j;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(ew2Var.f13714g);
        int i = ew2Var.f13716i;
        if (i != 1) {
            enumC1253b = i != 2 ? EnumC1253b.UNKNOWN : EnumC1253b.FEMALE;
        } else {
            enumC1253b = EnumC1253b.MALE;
        }
        return new C1255a(date, enumC1253b, hashSet, z, ew2Var.f13723p);
    }

    /* JADX INFO: renamed from: I2 */
    public static int m5265I2(byte[] bArr, int i, C4389w3 c4389w3) throws C4239l5 {
        int iM5395l0 = m5395l0(bArr, i, c4389w3);
        int i2 = c4389w3.f23583a;
        if (i2 < 0) {
            throw C4239l5.m9996b();
        }
        if (i2 == 0) {
            c4389w3.f23585c = "";
            return iM5395l0;
        }
        c4389w3.f23585c = C4367u7.f23503a.mo10292c(bArr, iM5395l0, i2);
        return iM5395l0 + i2;
    }

    /* JADX INFO: renamed from: I3 */
    public static void m5266I3(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    /* JADX INFO: renamed from: J */
    public static int m5267J(@RecentlyNonNull Parcel parcel, int i) {
        m5316U0(parcel, i, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: J0 */
    public static String m5268J0(g72 g72Var) {
        StringBuilder sb = new StringBuilder(g72Var.mo5719m());
        for (int i = 0; i < g72Var.mo5719m(); i++) {
            byte bMo5717h = g72Var.mo5717h(i);
            if (bMo5717h == 34) {
                sb.append("\\\"");
            } else if (bMo5717h == 39) {
                sb.append("\\'");
            } else if (bMo5717h != 92) {
                switch (bMo5717h) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo5717h < 32 || bMo5717h > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo5717h >>> 6) & 3) + 48));
                            sb.append((char) (((bMo5717h >>> 3) & 7) + 48));
                            sb.append((char) ((bMo5717h & 7) + 48));
                        } else {
                            sb.append((char) bMo5717h);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x0100 A[Catch: IllegalAccessException -> 0x0106, NoSuchFieldException -> 0x010d, TryCatch #5 {IllegalAccessException -> 0x0106, NoSuchFieldException -> 0x010d, blocks: (B:54:0x00f0, B:56:0x0100, B:58:0x0103), top: B:100:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0113  */
    /* JADX WARN: Code duplicated, block: B:69:0x0118  */
    /* JADX WARN: Code duplicated, block: B:72:0x0120  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:91:0x015d  */
    /* JADX WARN: Code duplicated, block: B:92:0x015f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0162  */
    /* JADX INFO: renamed from: J1 */
    public static final zf2 m5269J1(Context context, np1 np1Var) {
        zf2 zf2Var;
        String property;
        String[] strArr;
        zf2 zf2Var2 = zf2.ARM7;
        zf2 zf2Var3 = zf2.ARM64;
        zf2 zf2Var4 = zf2.X86_64;
        zf2 zf2Var5 = zf2.X86;
        zf2 zf2Var6 = zf2.UNKNOWN;
        zf2 zf2Var7 = zf2.UNSUPPORTED;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new ot1(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                m5235C2(bArr, null, context, np1Var);
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s = ByteBuffer.wrap(bArr2).getShort();
                                if (s == 3) {
                                    fileInputStream.close();
                                    zf2Var = zf2Var5;
                                } else if (s == 40) {
                                    fileInputStream.close();
                                    zf2Var = zf2Var2;
                                } else if (s == 62) {
                                    fileInputStream.close();
                                    zf2Var = zf2Var4;
                                } else if (s != 183) {
                                    m5235C2(bArr, null, context, np1Var);
                                } else {
                                    fileInputStream.close();
                                    zf2Var = zf2Var3;
                                }
                            }
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            q62.f18207a.mo7442a(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    m5235C2(null, e.toString(), context, np1Var);
                }
                zf2Var = zf2Var7;
            } else if (np1Var != null) {
                np1Var.m7916e(5017, "No .so");
            }
            if (zf2Var == zf2Var6) {
                HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
                property = System.getProperty("os.arch");
                if (TextUtils.isEmpty(property) || !hashSet.contains(property)) {
                    try {
                        strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                        if (strArr != null || strArr.length <= 0) {
                            property = Build.CPU_ABI;
                            if (property == null) {
                                property = Build.CPU_ABI2;
                            }
                        } else {
                            property = strArr[0];
                        }
                    } catch (IllegalAccessException e2) {
                        if (np1Var != null) {
                            np1Var.m7914c(2024, 0L, e2);
                        }
                    } catch (NoSuchFieldException e3) {
                        if (np1Var != null) {
                            np1Var.m7914c(2024, 0L, e3);
                        }
                    }
                }
                if (TextUtils.isEmpty(property)) {
                    m5235C2(null, "Empty dev arch", context, np1Var);
                } else if (!property.equalsIgnoreCase("i686") || property.equalsIgnoreCase("x86")) {
                    zf2Var2 = zf2Var5;
                } else if (property.equalsIgnoreCase("x86_64")) {
                    zf2Var2 = zf2Var4;
                } else if (property.equalsIgnoreCase("arm64-v8a")) {
                    zf2Var2 = zf2Var3;
                } else if (!property.equalsIgnoreCase("armeabi-v7a") && !property.equalsIgnoreCase("armv71")) {
                    m5235C2(null, property, context, np1Var);
                }
                zf2Var2 = zf2Var7;
            } else {
                zf2Var2 = zf2Var;
            }
            if (np1Var != null) {
                np1Var.m7916e(5018, zf2Var2.name());
            }
            return zf2Var2;
        }
        if (np1Var != null) {
            np1Var.m7916e(5017, "No lib/");
        }
        zf2Var = zf2Var6;
        if (zf2Var == zf2Var6) {
            HashSet hashSet2 = new HashSet(Arrays.asList("i686", "armv71"));
            property = System.getProperty("os.arch");
            if (TextUtils.isEmpty(property)) {
                strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null) {
                    property = Build.CPU_ABI;
                    if (property == null) {
                        property = Build.CPU_ABI2;
                    }
                } else {
                    property = Build.CPU_ABI;
                    if (property == null) {
                        property = Build.CPU_ABI2;
                    }
                }
            } else {
                strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null) {
                    property = Build.CPU_ABI;
                    if (property == null) {
                        property = Build.CPU_ABI2;
                    }
                } else {
                    property = Build.CPU_ABI;
                    if (property == null) {
                        property = Build.CPU_ABI2;
                    }
                }
            }
            if (TextUtils.isEmpty(property)) {
                m5235C2(null, "Empty dev arch", context, np1Var);
            } else if (property.equalsIgnoreCase("i686")) {
                zf2Var2 = zf2Var5;
            } else {
                zf2Var2 = zf2Var5;
            }
            zf2Var2 = zf2Var7;
        } else {
            zf2Var2 = zf2Var;
        }
        if (np1Var != null) {
            np1Var.m7916e(5018, zf2Var2.name());
        }
        return zf2Var2;
    }

    /* JADX INFO: renamed from: J2 */
    public static long m5270J2(ByteBuffer byteBuffer) {
        long jM5405n0 = m5405n0(byteBuffer) << 32;
        if (jM5405n0 >= 0) {
            return m5405n0(byteBuffer) + jM5405n0;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    /* JADX INFO: renamed from: J3 */
    public static void m5271J3(String str, Throwable th) {
        if (m5281L3(5)) {
            if (th != null) {
                m5241D3(m5251F3(str), th);
            } else {
                m5226A3(m5251F3(str));
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static long m5272K(@RecentlyNonNull Parcel parcel, int i) {
        m5316U0(parcel, i, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: K0 */
    public static String m5273K0(AbstractC4402x3 abstractC4402x3) {
        C4227k7 c4227k7 = new C4227k7(abstractC4402x3);
        StringBuilder sb = new StringBuilder(abstractC4402x3.mo9502f());
        for (int i = 0; i < c4227k7.f23270a.mo9502f(); i++) {
            byte bMo9501c = c4227k7.f23270a.mo9501c(i);
            if (bMo9501c == 34) {
                sb.append("\\\"");
            } else if (bMo9501c == 39) {
                sb.append("\\'");
            } else if (bMo9501c != 92) {
                switch (bMo9501c) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo9501c < 32 || bMo9501c > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo9501c >>> 6) & 3) + 48));
                            sb.append((char) (((bMo9501c >>> 3) & 7) + 48));
                            sb.append((char) ((bMo9501c & 7) + 48));
                        } else {
                            sb.append((char) bMo9501c);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: K1 */
    public static yv2 m5274K1(Throwable th, hx0 hx0Var) {
        yv2 yv2Var;
        yv2 yv2VarM5465z0 = m5465z0(th);
        int i = yv2VarM5465z0.f22116f;
        if ((i == 3 || i == 0) && (yv2Var = yv2VarM5465z0.f22119i) != null && !yv2Var.f22118h.equals("com.google.android.gms.ads")) {
            yv2VarM5465z0.f22119i = null;
        }
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14279U4)).booleanValue() && hx0Var != null) {
            yv2VarM5465z0.f22120j = new a60(hx0Var.f15046c, "", hx0Var);
        }
        return yv2VarM5465z0;
    }

    /* JADX INFO: renamed from: K2 */
    public static final Intent m5275K2(Intent intent, ResolveInfo resolveInfo, Context context) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    /* JADX INFO: renamed from: K3 */
    public static int m5276K3(ba2<?> ba2Var, int i, byte[] bArr, int i2, int i3, o82<?> o82Var, w62 w62Var) throws IOException {
        int iM5463y3 = m5463y3(ba2Var, bArr, i2, i3, w62Var);
        o82Var.add(w62Var.f21011c);
        while (iM5463y3 < i3) {
            int iM5390k0 = m5390k0(bArr, iM5463y3, w62Var);
            if (i != w62Var.f21009a) {
                break;
            }
            iM5463y3 = m5463y3(ba2Var, bArr, iM5390k0, i3, w62Var);
            o82Var.add(w62Var.f21011c);
        }
        return iM5463y3;
    }

    /* JADX INFO: renamed from: L */
    public static int m5277L(@RecentlyNonNull Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* JADX INFO: renamed from: L0 */
    public static String m5278L0(@NullableDecl String str) {
        int i = fs1.f14109a;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: L1 */
    public static jw2 m5279L1(Context context, List<sh1> list) {
        ArrayList arrayList = new ArrayList();
        for (sh1 sh1Var : list) {
            if (sh1Var.f19565c) {
                arrayList.add(C2177g.f10563h);
            } else {
                arrayList.add(new C2177g(sh1Var.f19563a, sh1Var.f19564b));
            }
        }
        return new jw2(context, (C2177g[]) arrayList.toArray(new C2177g[arrayList.size()]));
    }

    /* JADX INFO: renamed from: L2 */
    public static final ol1 m5280L2(final el1 el1Var, lv1 lv1Var, Object obj, pl1 pl1Var) {
        return m5412o2(new Callable(el1Var) { // from class: c.n.b.d.j.a.il1

            /* JADX INFO: renamed from: a */
            public final el1 f15294a;

            {
                this.f15294a = el1Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f15294a.zza();
                return null;
            }
        }, lv1Var, obj, pl1Var);
    }

    /* JADX INFO: renamed from: L3 */
    public static boolean m5281L3(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }

    /* JADX INFO: renamed from: M */
    public static void m5282M(@RecentlyNonNull Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m5277L(parcel, i));
    }

    /* JADX INFO: renamed from: M0 */
    public static String m5283M0(String str, Context context, boolean z) {
        String strM6051i;
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14332d0;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && !z) {
            return str;
        }
        C2330u c2330u = C2330u.f10884a;
        if (!c2330u.f10910y.m6048f(context) || TextUtils.isEmpty(str) || (strM6051i = c2330u.f10910y.m6051i(context)) == null) {
            return str;
        }
        if (!((Boolean) c2862b.f12496d.m6596a(C3052g3.f14280V)).booleanValue()) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (C2267h1.m4762x(str, c2330u.f10889d.f10715c, (String) c2862b.f12496d.m6596a(C3052g3.f14268T))) {
                c2330u.f10910y.m6055n(context, "_ac", strM6051i, null);
                return m5397l2(m5298P2(str, context), "fbs_aeid", strM6051i).toString();
            }
            if (!C2267h1.m4762x(str, c2330u.f10889d.f10716d, (String) c2862b.f12496d.m6596a(C3052g3.f14274U))) {
                return str;
            }
            c2330u.f10910y.m6055n(context, "_ai", strM6051i, null);
            return m5397l2(m5298P2(str, context), "fbs_aeid", strM6051i).toString();
        }
        String str2 = (String) c2862b.f12496d.m6596a(C3052g3.f14286W);
        if (!str.contains(str2)) {
            return str;
        }
        if (C2267h1.m4762x(str, c2330u.f10889d.f10715c, (String) c2862b.f12496d.m6596a(C3052g3.f14268T))) {
            c2330u.f10910y.m6055n(context, "_ac", strM6051i, null);
            return m5298P2(str, context).replace(str2, strM6051i);
        }
        if (!C2267h1.m4762x(str, c2330u.f10889d.f10716d, (String) c2862b.f12496d.m6596a(C3052g3.f14274U))) {
            return str;
        }
        c2330u.f10910y.m6055n(context, "_ai", strM6051i, null);
        return m5298P2(str, context).replace(str2, strM6051i);
    }

    /* JADX INFO: renamed from: M1 */
    public static Object m5284M1(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(outline.m1585g(20, "at index ", i));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX INFO: renamed from: M2 */
    public static yv2 m5285M2(int i, String str, yv2 yv2Var) {
        String str2;
        int i2;
        String str3;
        if (str == null) {
            int i3 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i3) {
                case 1:
                    str = "Invalid request.";
                    str2 = str;
                    break;
                case 2:
                    str2 = "No fill.";
                    break;
                case 3:
                    str = "App ID missing.";
                    str2 = str;
                    break;
                case 4:
                    str = "Network error.";
                    str2 = str;
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    str2 = str;
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    str2 = str;
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    str2 = str;
                    break;
                case 8:
                    str = "The ad is not ready.";
                    str2 = str;
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    str2 = str;
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    str2 = str;
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    str2 = str;
                    break;
                case 12:
                    if (((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14285V4)).intValue() > 0) {
                        str2 = "No fill.";
                    } else {
                        str = "The mediation adapter did not return an ad.";
                        str2 = str;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    str2 = str;
                    break;
                case 14:
                    str = "Ad inspector had an internal error.";
                    str2 = str;
                    break;
                case 15:
                    str = "Ad inspector failed to load.";
                    str2 = str;
                    break;
                case 16:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    str2 = str;
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because it is already open.";
                    str2 = str;
                    break;
            }
        } else {
            str2 = str;
        }
        int i4 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i4) {
            case 0:
            case 11:
            case 14:
                i2 = 0;
                return new yv2(i2, str2, "com.google.android.gms.ads", yv2Var, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 15:
                i2 = 1;
                return new yv2(i2, str2, "com.google.android.gms.ads", yv2Var, null);
            case 2:
            case 10:
            case 17:
                i2 = 3;
                return new yv2(i2, str2, "com.google.android.gms.ads", yv2Var, null);
            case 3:
                i2 = 8;
                return new yv2(i2, str2, "com.google.android.gms.ads", yv2Var, null);
            case 4:
            case 8:
            case 16:
                i2 = 2;
                return new yv2(i2, str2, "com.google.android.gms.ads", yv2Var, null);
            case 7:
                i2 = 4;
                return new yv2(i2, str2, "com.google.android.gms.ads", yv2Var, null);
            case 12:
                if (((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14285V4)).intValue() <= 0) {
                    i2 = 9;
                } else {
                    i2 = 3;
                }
                return new yv2(i2, str2, "com.google.android.gms.ads", yv2Var, null);
            case 13:
                i2 = 10;
                return new yv2(i2, str2, "com.google.android.gms.ads", yv2Var, null);
            default:
                switch (i) {
                    case 1:
                        str3 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str3 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str3 = "NO_FILL";
                        break;
                    case 4:
                        str3 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str3 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str3 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str3 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str3 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str3 = "NOT_READY";
                        break;
                    case 10:
                        str3 = "AD_REUSED";
                        break;
                    case 11:
                        str3 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str3 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str3 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str3 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str3 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 16:
                        str3 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 17:
                        str3 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str3 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError(outline.m1550A(new StringBuilder(str3.length() + 18), "Unknown SdkError: ", str3));
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static int m5286M3(int i, byte[] bArr, int i2, int i3, pa2 pa2Var, w62 w62Var) throws r82 {
        if ((i >>> 3) == 0) {
            throw r82.m8263d();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM5382i2 = m5382i2(bArr, i2, w62Var);
            pa2Var.m8093c(i, Long.valueOf(w62Var.f21010b));
            return iM5382i2;
        }
        if (i4 == 1) {
            pa2Var.m8093c(i, Long.valueOf(m5348b3(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM5390k0 = m5390k0(bArr, i2, w62Var);
            int i5 = w62Var.f21009a;
            if (i5 < 0) {
                throw r82.m8261b();
            }
            if (i5 > bArr.length - iM5390k0) {
                throw r82.m8260a();
            }
            if (i5 == 0) {
                pa2Var.m8093c(i, g72.f14513f);
            } else {
                pa2Var.m8093c(i, g72.m6939G(bArr, iM5390k0, i5));
            }
            return iM5390k0 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw r82.m8263d();
            }
            pa2Var.m8093c(i, Integer.valueOf(m5260H2(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        pa2 pa2VarM8091a = pa2.m8091a();
        int i7 = 0;
        while (i2 < i3) {
            int iM5390k1 = m5390k0(bArr, i2, w62Var);
            int i8 = w62Var.f21009a;
            if (i8 == i6) {
                i7 = i8;
                i2 = iM5390k1;
                break;
            }
            i7 = i8;
            i2 = m5286M3(i8, bArr, iM5390k1, i3, pa2VarM8091a, w62Var);
        }
        if (i2 > i3 || i7 != i6) {
            throw r82.m8266g();
        }
        pa2Var.m8093c(i, pa2VarM8091a);
        return i2;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: N */
    public static boolean m5287N(@RecentlyNonNull Context context, int i, @RecentlyNonNull String str) {
        C2793b c2793bM5637a = C2794c.m5637a(context);
        Objects.requireNonNull(c2793bM5637a);
        try {
            AppOpsManager appOpsManager = (AppOpsManager) c2793bM5637a.f11958a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static String m5288N0(JSONObject jSONObject, String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (m5333Y1(jSONArrayOptJSONArray2, str) && !m5333Y1(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    @NonNullDecl
    /* JADX INFO: renamed from: N1 */
    public static <T> T m5289N1(@NonNullDecl T t, @NullableDecl Object obj) {
        Objects.requireNonNull(t, (String) obj);
        return t;
    }

    /* JADX INFO: renamed from: N2 */
    public static File m5290N2(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: O */
    public static int m5291O(@RecentlyNonNull Parcel parcel) {
        int i = parcel.readInt();
        int iM5277L = m5277L(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (((char) i) != 20293) {
            String strValueOf = String.valueOf(Integer.toHexString(i));
            throw new C2768b(strValueOf.length() != 0 ? "Expected object header. Got 0x".concat(strValueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = iM5277L + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new C2768b(outline.m1586h(54, "Size read is invalid start=", iDataPosition, " end=", i2), parcel);
        }
        return i2;
    }

    /* JADX INFO: renamed from: O0 */
    public static String m5292O0(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    /* JADX INFO: renamed from: O1 */
    public static String m5293O1(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility != 4) {
                return visibility != 8 ? "viewNotVisible" : "viewGone";
            }
            return "viewInvisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    /* JADX INFO: renamed from: O2 */
    public static final String m5294O2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: P */
    public static void m5295P(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                parcel.writeInt(i | 0);
            }
        } else {
            int iM5239D1 = m5239D1(parcel, i);
            parcel.writeBundle(bundle);
            m5447v2(parcel, iM5239D1);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public static Date m5296P0(long j2) {
        return new Date((j2 - 2082844800) * 1000);
    }

    /* JADX INFO: renamed from: P1 */
    public static String m5297P1(s22 s22Var) throws NoSuchAlgorithmException {
        int iOrdinal = s22Var.ordinal();
        if (iOrdinal == 1) {
            return "HmacSha1";
        }
        if (iOrdinal == 3) {
            return "HmacSha256";
        }
        if (iOrdinal == 4) {
            return "HmacSha512";
        }
        String strValueOf = String.valueOf(s22Var);
        throw new NoSuchAlgorithmException(outline.m1550A(new StringBuilder(strValueOf.length() + 27), "hash unsupported for HMAC: ", strValueOf));
    }

    /* JADX INFO: renamed from: P2 */
    public static String m5298P2(String str, Context context) {
        C2330u c2330u = C2330u.f10884a;
        String strM6049g = c2330u.f10910y.m6049g(context);
        String strM6050h = c2330u.f10910y.m6050h(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strM6049g)) {
            str = m5397l2(str, "gmp_app_id", strM6049g).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strM6050h)) ? str : m5397l2(str, "fbs_aiid", strM6050h).toString();
    }

    /* JADX INFO: renamed from: Q */
    public static void m5299Q(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                parcel.writeInt(i | 0);
            }
        } else {
            int iM5239D1 = m5239D1(parcel, i);
            parcel.writeByteArray(bArr);
            m5447v2(parcel, iM5239D1);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public static <T> Set<T> m5300Q0(int i, boolean z) {
        return i <= (true != z ? 256 : 128) ? new ArraySet2(i) : new HashSet(i, true != z ? 1.0f : 0.75f);
    }

    /* JADX INFO: renamed from: Q1 */
    public static BigInteger m5301Q1(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* JADX INFO: renamed from: Q2 */
    public static String m5302Q2(@NullableDecl String str, @NullableDecl Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 9 + name2.length());
                    outline.m1572W(sb2, "<", string2, " threw ", name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb3 = new StringBuilder((length * 16) + str.length());
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i3, iIndexOf);
            sb3.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb3.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb3.append(", ");
                sb3.append(objArr[i4]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    /* JADX INFO: renamed from: R */
    public static void m5303R(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                parcel.writeInt(i | 0);
            }
        } else {
            int iM5239D1 = m5239D1(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m5447v2(parcel, iM5239D1);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static void m5304R0(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C4239l5 {
        if (!m5443u3(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m5443u3(b3) && !m5443u3(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw C4239l5.m10002h();
    }

    /* JADX INFO: renamed from: R1 */
    public static void m5305R1() {
        if (jo2.f15673a >= 18) {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: R2 */
    public static ECParameterSpec m5306R2(int i) throws NoSuchAlgorithmException {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? m5398l3("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650") : m5398l3("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
        }
        return m5398l3("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }

    /* JADX INFO: renamed from: S */
    public static void m5307S(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                parcel.writeInt(i | 0);
            }
        } else {
            int iM5239D1 = m5239D1(parcel, i);
            parcel.writeIntArray(iArr);
            m5447v2(parcel, iM5239D1);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static void m5308S0(byte b, byte b2, byte b3, char[] cArr, int i) throws C4239l5 {
        if (m5443u3(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m5443u3(b3)))) {
            throw C4239l5.m10002h();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: renamed from: S1 */
    public static void m5309S1(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(i2);
        throw new C2768b(outline.m1552C(sb, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: renamed from: S2 */
    public static void m5310S2(Bundle bundle, String str, Boolean bool, boolean z) {
        if (z) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m5311T(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                parcel.writeInt(i | 0);
            }
        } else {
            int iM5239D1 = m5239D1(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m5447v2(parcel, iM5239D1);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public static void m5312T0(byte b, byte b2, char[] cArr, int i) throws C4239l5 {
        if (b < -62 || m5443u3(b2)) {
            throw C4239l5.m10002h();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX INFO: renamed from: T1 */
    public static void m5313T1(InterfaceC3615va interfaceC3615va, String str, String str2) {
        interfaceC3615va.mo6478f(outline.m1553D(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, "(", str2, ");"));
    }

    /* JADX INFO: renamed from: T2 */
    public static <T extends Parcelable> void m5314T2(Parcel parcel, T t, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    /* JADX INFO: renamed from: U */
    public static void m5315U(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String str, boolean z) {
        if (str == null) {
            if (z) {
                parcel.writeInt(i | 0);
            }
        } else {
            int iM5239D1 = m5239D1(parcel, i);
            parcel.writeString(str);
            m5447v2(parcel, iM5239D1);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public static void m5316U0(Parcel parcel, int i, int i2) {
        int iM5277L = m5277L(parcel, i);
        if (iM5277L == i2) {
            return;
        }
        String hexString = Integer.toHexString(iM5277L);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iM5277L);
        throw new C2768b(outline.m1552C(sb, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: renamed from: U1 */
    public static final void m5317U1(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m5317U1(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m5317U1(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(m5268J0(g72.m6941K((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof g72) {
            sb.append(": \"");
            sb.append(m5268J0((g72) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof g82) {
            sb.append(" {");
            m5462y2((g82) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        m5317U1(sb, i4, "key", entry.getKey());
        m5317U1(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    /* JADX INFO: renamed from: U2 */
    public static void m5318U2(String str) {
        if (m5281L3(3)) {
            Log.d("Ads", str);
        }
    }

    /* JADX INFO: renamed from: V */
    public static void m5319V(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                parcel.writeInt(i | 0);
            }
        } else {
            int iM5239D1 = m5239D1(parcel, i);
            parcel.writeStringArray(strArr);
            m5447v2(parcel, iM5239D1);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static void m5320V0(kv1<?> kv1Var, String str) {
        C2999eo c2999eo = new C2999eo(str);
        kv1Var.mo6230f(new ev1(kv1Var, c2999eo), C2962do.f13335f);
    }

    /* JADX INFO: renamed from: V1 */
    public static void m5321V1(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* JADX INFO: renamed from: V2 */
    public static void m5322V2(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: W */
    public static void m5323W(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                parcel.writeInt(i | 0);
            }
        } else {
            int iM5239D1 = m5239D1(parcel, i);
            parcel.writeStringList(list);
            m5447v2(parcel, iM5239D1);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public static void m5324W0(g22 g22Var) throws GeneralSecurityException {
        m5306R2(m5377h2(g22Var.m6919v().m8185v()));
        m5297P1(g22Var.m6919v().m8186x());
        if (g22Var.m6921y() == x12.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        k32 k32VarM5682v = g22Var.m6920x().m5682v();
        Logger logger = cx1.f13142a;
        synchronized (cx1.class) {
            hw1<?> hw1VarMo6117a = cx1.m6264h(k32VarM5682v.m7434v()).mo6117a();
            if (!cx1.f13145d.get(k32VarM5682v.m7434v()).booleanValue()) {
                String strValueOf = String.valueOf(k32VarM5682v.m7434v());
                throw new GeneralSecurityException(strValueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(strValueOf) : new String("newKey-operation not permitted for key type "));
            }
            ((iw1) hw1VarMo6117a).m7312b(k32VarM5682v.m7435x());
        }
    }

    /* JADX INFO: renamed from: W1 */
    public static boolean m5325W1(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                try {
                    fileOutputStream2.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (IOException unused2) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream == null) {
                    return false;
                }
                try {
                    fileOutputStream.close();
                    return false;
                } catch (IOException unused3) {
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: W2 */
    public static void m5326W2(byte[] bArr, long j2, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j2);
            i2++;
            j2 >>= 8;
        }
    }

    /* JADX INFO: renamed from: X */
    public static <T extends Parcelable> void m5327X(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                parcel.writeInt(i | 0);
                return;
            }
            return;
        }
        int iM5239D1 = m5239D1(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m5314T2(parcel, t, i2);
            }
        }
        m5447v2(parcel, iM5239D1);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x024a  */
    /* JADX WARN: Code duplicated, block: B:116:0x024c  */
    /* JADX INFO: renamed from: X0 */
    public static void m5328X0(InterfaceC3895i6 interfaceC3895i6, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC3895i6.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            boolean zBooleanValue = true;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m5356d1(sb, i, m5224A1(strConcat), AbstractC4057z4.m9318j(method2, interfaceC3895i6, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m5356d1(sb, i, m5224A1(strConcat2), AbstractC4057z4.m9318j(method3, interfaceC3895i6, new Object[0]));
                }
            }
            if (((Method) map2.get(strSubstring.length() != 0 ? "set".concat(strSubstring) : new String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                Method method4 = (Method) map.get(strSubstring.length() != 0 ? "get".concat(strSubstring) : new String("get"));
                Method method5 = (Method) map.get(strSubstring.length() != 0 ? "has".concat(strSubstring) : new String("has"));
                if (method4 != null) {
                    Object objM9318j = AbstractC4057z4.m9318j(method4, interfaceC3895i6, new Object[0]);
                    if (method5 == null) {
                        if (objM9318j instanceof Boolean) {
                            if (((Boolean) objM9318j).booleanValue()) {
                                zEquals = false;
                            } else {
                                zEquals = true;
                            }
                        } else if (objM9318j instanceof Integer) {
                            if (((Integer) objM9318j).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM9318j instanceof Float) {
                            if (((Float) objM9318j).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM9318j instanceof Double) {
                            if (((Double) objM9318j).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM9318j instanceof String) {
                            zEquals = objM9318j.equals("");
                        } else if (objM9318j instanceof AbstractC3823b4) {
                            zEquals = objM9318j.equals(AbstractC3823b4.f22519f);
                        } else if (!(objM9318j instanceof InterfaceC3895i6) ? !((objM9318j instanceof Enum) && ((Enum) objM9318j).ordinal() == 0) : objM9318j != ((InterfaceC3895i6) objM9318j).mo9049d()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC4057z4.m9318j(method5, interfaceC3895i6, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m5356d1(sb, i, m5224A1(strConcat3), objM9318j);
                    }
                }
            }
        }
        if (interfaceC3895i6 instanceof AbstractC4057z4.b) {
            Iterator<Map.Entry<T, Object>> itM9195b = ((AbstractC4057z4.b) interfaceC3895i6).zzbnb.m9195b();
            if (itM9195b.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        C3936m7 c3936m7 = ((AbstractC4057z4) interfaceC3895i6).zzbmy;
        if (c3936m7 != null) {
            for (int i2 = 0; i2 < c3936m7.f22807b; i2++) {
                m5356d1(sb, i, String.valueOf(c3936m7.f22808c[i2] >>> 3), c3936m7.f22809d[i2]);
            }
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static boolean m5329X1(String str) {
        return "video".equals(m5437t2(str));
    }

    /* JADX INFO: renamed from: X2 */
    public static final byte[] m5330X2(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return m5347b2(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    /* JADX INFO: renamed from: Y */
    public static <T extends Parcelable> void m5331Y(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                parcel.writeInt(i | 0);
                return;
            }
            return;
        }
        int iM5239D1 = m5239D1(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m5314T2(parcel, t, 0);
            }
        }
        m5447v2(parcel, iM5239D1);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x024a  */
    /* JADX WARN: Code duplicated, block: B:116:0x024c  */
    /* JADX INFO: renamed from: Y0 */
    public static void m5332Y0(InterfaceC4240l6 interfaceC4240l6, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC4240l6.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            boolean zBooleanValue = true;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m5446v1(sb, i, m5436t1(strConcat), AbstractC4099b5.m9412o(method2, interfaceC4240l6, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m5446v1(sb, i, m5436t1(strConcat2), AbstractC4099b5.m9412o(method3, interfaceC4240l6, new Object[0]));
                }
            }
            if (((Method) map2.get(strSubstring.length() != 0 ? "set".concat(strSubstring) : new String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                Method method4 = (Method) map.get(strSubstring.length() != 0 ? "get".concat(strSubstring) : new String("get"));
                Method method5 = (Method) map.get(strSubstring.length() != 0 ? "has".concat(strSubstring) : new String("has"));
                if (method4 != null) {
                    Object objM9412o = AbstractC4099b5.m9412o(method4, interfaceC4240l6, new Object[0]);
                    if (method5 == null) {
                        if (objM9412o instanceof Boolean) {
                            if (((Boolean) objM9412o).booleanValue()) {
                                zEquals = false;
                            } else {
                                zEquals = true;
                            }
                        } else if (objM9412o instanceof Integer) {
                            if (((Integer) objM9412o).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM9412o instanceof Float) {
                            if (((Float) objM9412o).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM9412o instanceof Double) {
                            if (((Double) objM9412o).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM9412o instanceof String) {
                            zEquals = objM9412o.equals("");
                        } else if (objM9412o instanceof AbstractC4402x3) {
                            zEquals = objM9412o.equals(AbstractC4402x3.f23614f);
                        } else if (!(objM9412o instanceof InterfaceC4240l6) ? !((objM9412o instanceof Enum) && ((Enum) objM9412o).ordinal() == 0) : objM9412o != ((InterfaceC4240l6) objM9412o).mo9418g()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC4099b5.m9412o(method5, interfaceC4240l6, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m5446v1(sb, i, m5436t1(strConcat3), objM9412o);
                    }
                }
            }
        }
        if (interfaceC4240l6 instanceof AbstractC4099b5.d) {
            Iterator<Map.Entry<T, Object>> itM10276l = ((AbstractC4099b5.d) interfaceC4240l6).zzc.m10276l();
            if (itM10276l.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        C4255m7 c4255m7 = ((AbstractC4099b5) interfaceC4240l6).zzb;
        if (c4255m7 != null) {
            for (int i2 = 0; i2 < c4255m7.f23318b; i2++) {
                m5446v1(sb, i, String.valueOf(c4255m7.f23319c[i2] >>> 3), c4255m7.f23320d[i2]);
            }
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static boolean m5333Y1(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (Pattern.compile(jSONArray.optString(i)).matcher(str).lookingAt()) {
                        return true;
                    }
                } catch (PatternSyntaxException e) {
                    C2998en c2998en = C2330u.f10884a.f10893h;
                    C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Y2 */
    public static double m5334Y2(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 65536.0d;
    }

    /* JADX INFO: renamed from: Z */
    public static int m5335Z(int i, byte[] bArr, int i2, int i3, C4389w3 c4389w3) throws C4239l5 {
        if ((i >>> 3) == 0) {
            throw C4239l5.m9998d();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m5249F1(bArr, i2, c4389w3);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m5395l0(bArr, i2, c4389w3) + c4389w3.f23583a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw C4239l5.m9998d();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = m5395l0(bArr, i2, c4389w3);
            i6 = c4389w3.f23583a;
            if (i6 == i5) {
                break;
            }
            i2 = m5335Z(i6, bArr, i2, i3, c4389w3);
        }
        if (i2 > i3 || i6 != i5) {
            throw C4239l5.m10001g();
        }
        return i2;
    }

    /* JADX INFO: renamed from: Z0 */
    public static void m5336Z0(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            throw new NullPointerException(outline.m1550A(new StringBuilder(strValueOf.length() + 24), "null key in entry: null=", strValueOf));
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        throw new NullPointerException(outline.m1552C(new StringBuilder(strValueOf2.length() + 26), "null value in entry: ", strValueOf2, "=null"));
    }

    /* JADX INFO: renamed from: Z1 */
    public static byte[] m5337Z1(String str, boolean z) throws IllegalArgumentException {
        byte[] bArrDecode = Base64.decode(str, true != z ? 2 : 11);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Unable to decode ".concat(str) : new String("Unable to decode "));
    }

    /* JADX INFO: renamed from: Z2 */
    public static int m5338Z2(int i, int i2, @NullableDecl String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m5428r3(i, i2, "index"));
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static void m5339a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static int m5340a0(int i, byte[] bArr, int i2, int i3, InterfaceC4197i5<?> interfaceC4197i5, C4389w3 c4389w3) {
        C4141e5 c4141e5 = (C4141e5) interfaceC4197i5;
        int iM5395l0 = m5395l0(bArr, i2, c4389w3);
        c4141e5.m9555j(c4389w3.f23583a);
        while (iM5395l0 < i3) {
            int iM5395l1 = m5395l0(bArr, iM5395l0, c4389w3);
            if (i != c4389w3.f23583a) {
                break;
            }
            iM5395l0 = m5395l0(bArr, iM5395l1, c4389w3);
            c4141e5.m9555j(c4389w3.f23583a);
        }
        return iM5395l0;
    }

    /* JADX INFO: renamed from: a1 */
    public static void m5341a1(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public static byte[] m5342a2(byte[] bArr) {
        int length = bArr.length;
        if (length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[length] = -128;
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: a3 */
    public static int m5343a3(byte[] bArr, int i, C4389w3 c4389w3) throws C4239l5 {
        int iM5395l0 = m5395l0(bArr, i, c4389w3);
        int i2 = c4389w3.f23583a;
        if (i2 < 0) {
            throw C4239l5.m9996b();
        }
        if (i2 > bArr.length - iM5395l0) {
            throw C4239l5.m9995a();
        }
        if (i2 == 0) {
            c4389w3.f23585c = AbstractC4402x3.f23614f;
            return iM5395l0;
        }
        c4389w3.f23585c = AbstractC4402x3.m10331m(bArr, iM5395l0, i2);
        return iM5395l0 + i2;
    }

    /* JADX INFO: renamed from: b */
    public static void m5344b(boolean z, @RecentlyNonNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static int m5345b0(int i, byte[] bArr, int i2, int i3, C4255m7 c4255m7, C4389w3 c4389w3) throws C4239l5 {
        if ((i >>> 3) == 0) {
            throw C4239l5.m9998d();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM5249F1 = m5249F1(bArr, i2, c4389w3);
            c4255m7.m10011a(i, Long.valueOf(c4389w3.f23584b));
            return iM5249F1;
        }
        if (i4 == 1) {
            c4255m7.m10011a(i, Long.valueOf(m5362e2(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM5395l0 = m5395l0(bArr, i2, c4389w3);
            int i5 = c4389w3.f23583a;
            if (i5 < 0) {
                throw C4239l5.m9996b();
            }
            if (i5 > bArr.length - iM5395l0) {
                throw C4239l5.m9995a();
            }
            if (i5 == 0) {
                c4255m7.m10011a(i, AbstractC4402x3.f23614f);
            } else {
                c4255m7.m10011a(i, AbstractC4402x3.m10331m(bArr, iM5395l0, i5));
            }
            return iM5395l0 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw C4239l5.m9998d();
            }
            c4255m7.m10011a(i, Integer.valueOf(m5385j0(bArr, i2)));
            return i2 + 4;
        }
        C4255m7 c4255m7M10010c = C4255m7.m10010c();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (i2 < i3) {
            int iM5395l1 = m5395l0(bArr, i2, c4389w3);
            int i8 = c4389w3.f23583a;
            if (i8 == i6) {
                i7 = i8;
                i2 = iM5395l1;
                break;
            }
            i7 = i8;
            i2 = m5345b0(i8, bArr, iM5395l1, i3, c4255m7M10010c, c4389w3);
        }
        if (i2 > i3 || i7 != i6) {
            throw C4239l5.m10001g();
        }
        c4255m7.m10011a(i, c4255m7M10010c);
        return i2;
    }

    /* JADX INFO: renamed from: b1 */
    public static void m5346b1(String str) {
        if (C3609v4.f20694a.m6603d().booleanValue()) {
            m5318U2(str);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public static final byte[] m5347b2(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: b3 */
    public static long m5348b3(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: c */
    public static void m5349c(@RecentlyNonNull Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            outline.m1572W(sb, "Must be called on ", name2, " thread, but got ", name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static int m5350c0(int i, byte[] bArr, int i2, C4389w3 c4389w3) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c4389w3.f23583a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c4389w3.f23583a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c4389w3.f23583a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c4389w3.f23583a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c4389w3.f23583a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: c1 */
    public static void m5351c1(String str, Exception exc) {
        int i = gn1.f14628a;
        Log.e("OMIDLIB", str, exc);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX INFO: renamed from: c2 */
    public static String[] m5352c2(String str, boolean z) {
        Character.UnicodeBlock unicodeBlockOf;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int length = str.length();
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (i < length) {
            int iCodePointAt = Character.codePointAt(charArray, i);
            int iCharCount = Character.charCount(iCodePointAt);
            if (Character.isLetter(iCodePointAt) && ((unicodeBlockOf = Character.UnicodeBlock.of(iCodePointAt)) == Character.UnicodeBlock.BOPOMOFO || unicodeBlockOf == Character.UnicodeBlock.BOPOMOFO_EXTENDED || unicodeBlockOf == Character.UnicodeBlock.CJK_COMPATIBILITY || unicodeBlockOf == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || unicodeBlockOf == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || unicodeBlockOf == Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS || unicodeBlockOf == Character.UnicodeBlock.HANGUL_JAMO || unicodeBlockOf == Character.UnicodeBlock.HANGUL_SYLLABLES || unicodeBlockOf == Character.UnicodeBlock.HIRAGANA || unicodeBlockOf == Character.UnicodeBlock.KATAKANA || unicodeBlockOf == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS || ((iCodePointAt >= 65382 && iCodePointAt <= 65437) || (iCodePointAt >= 65441 && iCodePointAt <= 65500)))) {
                if (z2) {
                    arrayList.add(new String(charArray, i2, i - i2));
                }
                arrayList.add(new String(charArray, i, iCharCount));
            } else {
                if (Character.isLetterOrDigit(iCodePointAt) || Character.getType(iCodePointAt) == 6 || Character.getType(iCodePointAt) == 8) {
                    if (true != z2) {
                        i2 = i;
                    }
                    z2 = true;
                } else if (z && Character.charCount(iCodePointAt) == 1 && Character.toChars(iCodePointAt)[0] == '\'') {
                    if (true != z2) {
                        i2 = i;
                    }
                    z2 = true;
                } else if (z2) {
                    arrayList.add(new String(charArray, i2, i - i2));
                }
                i += iCharCount;
            }
            z2 = false;
            i += iCharCount;
        }
        if (z2) {
            arrayList.add(new String(charArray, i2, i - i2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: c3 */
    public static Pair<ByteBuffer, Long> m5353c3(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        m5413o3(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i3 = iCapacity - 22;
            int iMin = Math.min(i3, 65535);
            int i4 = 0;
            while (true) {
                if (i4 >= iMin) {
                    i2 = -1;
                    break;
                }
                i2 = i3 - i4;
                if (byteBufferAllocate.getInt(i2) == 101010256 && ((char) byteBufferAllocate.getShort(i2 + 20)) == i4) {
                    break;
                }
                i4++;
            }
        } else {
            i2 = -1;
            break;
        }
        if (i2 == -1) {
            return null;
        }
        byteBufferAllocate.position(i2);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i2)));
    }

    /* JADX INFO: renamed from: d */
    public static void m5354d(@RecentlyNonNull String str) {
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static int m5355d0(EnumC1252a enumC1252a) {
        int iOrdinal = enumC1252a.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 0 : 2;
        }
        return 3;
    }

    /* JADX INFO: renamed from: d1 */
    public static final void m5356d1(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m5356d1(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m5356d1(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            AbstractC3823b4 abstractC3823b4 = AbstractC3823b4.f22519f;
            sb.append(m5432s2(new C3893i4(((String) obj).getBytes(C3814a5.f22506a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC3823b4) {
            sb.append(": \"");
            sb.append(m5432s2((AbstractC3823b4) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC4057z4) {
            sb.append(" {");
            m5328X0((AbstractC4057z4) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        m5356d1(sb, i4, "key", entry.getKey());
        m5356d1(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    /* JADX INFO: renamed from: d2 */
    public static X509Certificate[][] m5357d2(FileChannel fileChannel, nq1 nq1Var) throws SecurityException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferM5236C3 = m5236C3(nq1Var.f17241a);
                int i = 0;
                while (byteBufferM5236C3.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m5240D2(m5236C3(byteBufferM5236C3), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                long j2 = nq1Var.f17242b;
                long j3 = nq1Var.f17243c;
                long j4 = nq1Var.f17244d;
                ByteBuffer byteBuffer = nq1Var.f17245e;
                if (map.isEmpty()) {
                    throw new SecurityException("No digests provided");
                }
                e11 e11Var = new e11(fileChannel, 0L, j2);
                e11 e11Var2 = new e11(fileChannel, j3, j4 - j3);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                m5413o3(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j2 < 0 || j2 > 4294967295L) {
                    StringBuilder sb2 = new StringBuilder(47);
                    sb2.append("uint32 value of out range: ");
                    sb2.append(j2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j2);
                C3108hm c3108hm = new C3108hm(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = ((Integer) it.next()).intValue();
                    i2++;
                }
                try {
                    byte[][] bArrM5378h3 = m5378h3(iArr, new eb0[]{e11Var, e11Var2, c3108hm});
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = iArr[i3];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i4)), bArrM5378h3[i3])) {
                            throw new SecurityException(m5423q3(i4).concat(" digest of contents did not verify"));
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e2) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    /* JADX INFO: renamed from: d3 */
    public static void m5358d3(String str, Throwable th) {
        if (m5281L3(3)) {
            Log.d("Ads", str, th);
        }
    }

    @RecentlyNonNull
    @EnsuresNonNull({"#1"})
    /* JADX INFO: renamed from: e */
    public static String m5359e(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m5360e0(InterfaceC4431z6<?> interfaceC4431z6, int i, byte[] bArr, int i2, int i3, InterfaceC4197i5<?> interfaceC4197i5, C4389w3 c4389w3) throws IOException {
        int iM5370g0 = m5370g0(interfaceC4431z6, bArr, i2, i3, c4389w3);
        interfaceC4197i5.add(c4389w3.f23585c);
        while (iM5370g0 < i3) {
            int iM5395l0 = m5395l0(bArr, iM5370g0, c4389w3);
            if (i != c4389w3.f23583a) {
                break;
            }
            iM5370g0 = m5370g0(interfaceC4431z6, bArr, iM5395l0, i3, c4389w3);
            interfaceC4197i5.add(c4389w3.f23585c);
        }
        return iM5370g0;
    }

    /* JADX INFO: renamed from: e1 */
    public static void m5361e1(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerM5301Q1 = m5301Q1(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(bigIntegerM5301Q1) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(bigIntegerM5301Q1) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(bigIntegerM5301Q1).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(bigIntegerM5301Q1))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static long m5362e2(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: e3 */
    public static void m5363e3(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    @RecentlyNonNull
    @EnsuresNonNull({"#1"})
    /* JADX INFO: renamed from: f */
    public static String m5364f(String str, @RecentlyNonNull Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    /* JADX INFO: renamed from: f0 */
    public static int m5365f0(InterfaceC4431z6 interfaceC4431z6, byte[] bArr, int i, int i2, int i3, C4389w3 c4389w3) throws IOException {
        C4268n6 c4268n6 = (C4268n6) interfaceC4431z6;
        Object objZza = c4268n6.zza();
        int iM10067m = c4268n6.m10067m(objZza, bArr, i, i2, i3, c4389w3);
        c4268n6.mo10059e(objZza);
        c4389w3.f23585c = objZza;
        return iM10067m;
    }

    /* JADX INFO: renamed from: f1 */
    public static void m5366f1(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: f2 */
    public static void m5367f2(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: f3 */
    public static boolean m5368f3(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: g */
    public static void m5369g(@RecentlyNonNull String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static int m5370g0(InterfaceC4431z6 interfaceC4431z6, byte[] bArr, int i, int i2, C4389w3 c4389w3) throws IOException {
        int iM5350c0 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM5350c0 = m5350c0(i3, bArr, iM5350c0, c4389w3);
            i3 = c4389w3.f23583a;
        }
        int i4 = iM5350c0;
        if (i3 < 0 || i3 > i2 - i4) {
            throw C4239l5.m9995a();
        }
        Object objZza = interfaceC4431z6.zza();
        int i5 = i3 + i4;
        interfaceC4431z6.mo10061g(objZza, bArr, i4, i5, c4389w3);
        interfaceC4431z6.mo10059e(objZza);
        c4389w3.f23585c = objZza;
        return i5;
    }

    /* JADX INFO: renamed from: g1 */
    public static void m5371g1(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public static int m5372g2(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        return 0;
    }

    /* JADX INFO: renamed from: g3 */
    public static boolean m5373g3(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            z = true;
            for (int i = 0; i < length; i++) {
                File file2 = fileArrListFiles[i];
                z = file2 != null && m5373g3(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    @EnsuresNonNull({"#1"})
    /* JADX INFO: renamed from: h */
    public static <T> T m5374h(T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    /* JADX INFO: renamed from: h0 */
    public static int m5375h0(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes(Utf8Charset.NAME);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        int length = bytes.length;
        int i = 0;
        int i2 = (length & (-4)) + 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4 += 4) {
            int i5 = ((bytes[i4] & 255) | ((bytes[i4 + 1] & 255) << 8) | ((bytes[i4 + 2] & 255) << 16) | (bytes[i4 + 3] << 24)) * (-862048943);
            int i6 = i3 ^ (((i5 << 15) | (i5 >>> 17)) * 461845907);
            i3 = (((i6 >>> 19) | (i6 << 13)) * 5) - 430675100;
        }
        int i7 = length & 3;
        if (i7 == 1) {
            int i8 = ((bytes[i2] & 255) | i) * (-862048943);
            i3 ^= ((i8 >>> 17) | (i8 << 15)) * 461845907;
        } else {
            if (i7 != 2) {
                i = i7 == 3 ? (bytes[i2 + 2] & 255) << 16 : 0;
            }
            i |= (bytes[i2 + 1] & 255) << 8;
            int i9 = ((bytes[i2] & 255) | i) * (-862048943);
            i3 ^= ((i9 >>> 17) | (i9 << 15)) * 461845907;
        }
        int i10 = i3 ^ length;
        int i11 = (i10 ^ (i10 >>> 16)) * (-2048144789);
        int i12 = (i11 ^ (i11 >>> 13)) * (-1028477387);
        return i12 ^ (i12 >>> 16);
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ boolean m5376h1(byte b) {
        return b >= 0;
    }

    /* JADX INFO: renamed from: h2 */
    public static int m5377h2(r22 r22Var) throws GeneralSecurityException {
        int iOrdinal = r22Var.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                String strValueOf = String.valueOf(r22Var);
                throw new GeneralSecurityException(outline.m1550A(new StringBuilder(strValueOf.length() + 20), "unknown curve type: ", strValueOf));
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: h3 */
    public static byte[][] m5378h3(int[] iArr, eb0[] eb0VarArr) throws DigestException {
        int i;
        long j2;
        int length;
        String str;
        long j3 = 0;
        int i2 = 0;
        long jZza = 0;
        while (true) {
            i = 3;
            j2 = 1048576;
            if (i2 >= 3) {
                break;
            }
            jZza += (eb0VarArr[i2].zza() + 1048575) / 1048576;
            i2++;
        }
        if (jZza >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(jZza);
            throw new DigestException(sb.toString());
        }
        int i3 = (int) jZza;
        byte[][] bArr = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i4 >= length) {
                break;
            }
            byte[] bArr2 = new byte[(m5448v3(iArr[i4]) * i3) + 5];
            bArr2[0] = 90;
            m5266I3(i3, bArr2);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i5 = 0;
        while (true) {
            str = " digest not supported";
            if (i5 >= iArr.length) {
                break;
            }
            String strM5423q3 = m5423q3(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(strM5423q3);
                i5++;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(strM5423q3.concat(" digest not supported"), e);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i) {
            eb0 eb0Var = eb0VarArr[i6];
            String str2 = str;
            int i9 = i8;
            long jZza2 = eb0Var.zza();
            long j4 = j2;
            long j5 = j3;
            while (jZza2 > j3) {
                int iMin = (int) Math.min(jZza2, j4);
                m5266I3(iMin, bArr3);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr3);
                }
                try {
                    eb0Var.mo6579a(messageDigestArr, j5, iMin);
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        byte[] bArr4 = bArr[i11];
                        int iM5448v3 = m5448v3(i12);
                        byte[] bArr5 = bArr3;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr4, (i7 * iM5448v3) + 5, iM5448v3);
                        if (iDigest != iM5448v3) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(iDigest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i11++;
                        bArr3 = bArr5;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j6 = iMin;
                    j5 += j6;
                    jZza2 -= j6;
                    i7++;
                    j3 = 0;
                    j4 = 1048576;
                } catch (IOException e2) {
                    throw new DigestException(outline.m1586h(59, "Failed to digest chunk #", i7, " of section #", i9), e2);
                }
            }
            i8 = i9 + 1;
            i6++;
            j3 = 0;
            i = 3;
            j2 = 1048576;
            str = str2;
        }
        String str3 = str;
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr7 = bArr[i13];
            String strM5423q4 = m5423q3(i14);
            try {
                bArr6[i13] = MessageDigest.getInstance(strM5423q4).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(strM5423q4.concat(str3), e3);
            }
        }
        return bArr6;
    }

    @EnsuresNonNull({"#1"})
    /* JADX INFO: renamed from: i */
    public static <T> T m5379i(@RecentlyNonNull T t, @RecentlyNonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: i0 */
    public static int m5380i0(Set<?> set) {
        Iterator<?> it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: i1 */
    public static boolean m5381i1(@RecentlyNonNull Context context) {
        if (f11595c == null) {
            f11595c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f11595c.booleanValue();
    }

    /* JADX INFO: renamed from: i2 */
    public static int m5382i2(byte[] bArr, int i, w62 w62Var) {
        int i2 = i + 1;
        long j2 = bArr[i];
        if (j2 >= 0) {
            w62Var.f21010b = j2;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = (j2 & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        w62Var.f21010b = j3;
        return i3;
    }

    /* JADX INFO: renamed from: i3 */
    public static double m5383i3(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    /* JADX INFO: renamed from: j */
    public static void m5384j(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static int m5385j0(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: j1 */
    public static boolean m5386j1(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == null && bundle2 == null;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null || obj2 == null) {
                return obj == null && obj2 == null;
            }
            if (obj instanceof Bundle) {
                if (!(obj2 instanceof Bundle) || !m5386j1((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                    return false;
                }
                for (int i = 0; i < length; i++) {
                    if (!m5459y(Array.get(obj, i), Array.get(obj2, i))) {
                        return false;
                    }
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j2 */
    public static int m5387j2(byte[] bArr, int i, C4389w3 c4389w3) throws C4239l5 {
        int iM5395l0 = m5395l0(bArr, i, c4389w3);
        int i2 = c4389w3.f23583a;
        if (i2 < 0) {
            throw C4239l5.m9996b();
        }
        if (i2 == 0) {
            c4389w3.f23585c = "";
            return iM5395l0;
        }
        c4389w3.f23585c = new String(bArr, iM5395l0, i2, C4127d5.f23112a);
        return iM5395l0 + i2;
    }

    /* JADX INFO: renamed from: j3 */
    public static int m5388j3(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String strValueOf = String.valueOf(Long.toHexString(i));
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(strValueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m5389k(boolean z, @RecentlyNonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static int m5390k0(byte[] bArr, int i, w62 w62Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m5234C1(b, bArr, i2, w62Var);
        }
        w62Var.f21009a = b;
        return i2;
    }

    /* JADX INFO: renamed from: k1 */
    public static boolean m5391k1(C3533t3 c3533t3, C3422q3 c3422q3, String... strArr) {
        if (c3422q3 == null) {
            return false;
        }
        c3533t3.m8396a(c3422q3, C2330u.f10884a.f10896k.mo5621a(), strArr);
        return true;
    }

    /* JADX INFO: renamed from: k2 */
    public static final ResolveInfo m5392k2(Intent intent, ArrayList<ResolveInfo> arrayList, Context context, rd2 rd2Var, View view) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                }
            }
            arrayList.addAll(listQueryIntentActivities);
        } catch (Throwable th) {
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        return resolveInfo;
    }

    /* JADX INFO: renamed from: k3 */
    public static int m5393k3(byte[] bArr, int i, w62 w62Var) throws r82 {
        int iM5390k0 = m5390k0(bArr, i, w62Var);
        int i2 = w62Var.f21009a;
        if (i2 < 0) {
            throw r82.m8261b();
        }
        if (i2 == 0) {
            w62Var.f21011c = "";
            return iM5390k0;
        }
        w62Var.f21011c = new String(bArr, iM5390k0, i2, p82.f17879a);
        return iM5390k0 + i2;
    }

    /* JADX INFO: renamed from: l */
    public static <T> boolean m5394l(@RecentlyNonNull T[] tArr, @RecentlyNonNull T t) {
        int length = tArr != null ? tArr.length : 0;
        for (int i = 0; i < length; i++) {
            if (m5459y(tArr[i], t)) {
                if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public static int m5395l0(byte[] bArr, int i, C4389w3 c4389w3) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m5350c0(b, bArr, i2, c4389w3);
        }
        c4389w3.f23583a = b;
        return i2;
    }

    /* JADX INFO: renamed from: l1 */
    public static boolean m5396l1(zf2 zf2Var) {
        int iOrdinal = zf2Var.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4;
    }

    /* JADX INFO: renamed from: l2 */
    public static Uri m5397l2(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        outline.m1572W(sb, str2, "=", str3, "&");
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }

    /* JADX INFO: renamed from: l3 */
    public static ECParameterSpec m5398l3(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public static long m5399m(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j2 = 0;
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, i);
                if (i2 == -1) {
                    break;
                }
                j2 += (long) i2;
                outputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                if (z) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
                throw th;
            }
        }
        if (z) {
            try {
                inputStream.close();
            } catch (IOException unused3) {
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused4) {
                }
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: m0 */
    public static int m5400m0(byte[] bArr, int i, InterfaceC4197i5<?> interfaceC4197i5, C4389w3 c4389w3) throws IOException {
        C4141e5 c4141e5 = (C4141e5) interfaceC4197i5;
        int iM5395l0 = m5395l0(bArr, i, c4389w3);
        int i2 = c4389w3.f23583a + iM5395l0;
        while (iM5395l0 < i2) {
            iM5395l0 = m5395l0(bArr, iM5395l0, c4389w3);
            c4141e5.m9555j(c4389w3.f23583a);
        }
        if (iM5395l0 == i2) {
            return iM5395l0;
        }
        throw C4239l5.m9995a();
    }

    /* JADX INFO: renamed from: m1 */
    public static boolean m5401m1(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: m2 */
    public static <AppOpenAdRequestComponent extends r50<AppOpenAd>, AppOpenAd extends m20> lf1<AppOpenAdRequestComponent, AppOpenAd> m5402m2(Context context, jj1 jj1Var, ak1 ak1Var) {
        if (((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14371i4)).intValue() <= 0) {
            return new af1();
        }
        zj1 zj1VarM5820a = ak1Var.m5820a(rj1.AppOpen, context, jj1Var, new qe1(new me1()));
        bf1 bf1Var = new bf1(new af1());
        nj1 nj1Var = zj1VarM5820a.f22304a;
        lv1 lv1Var = C2962do.f13330a;
        return new se1(bf1Var, new ye1(nj1Var, lv1Var), zj1VarM5820a.f22305b, lv1Var);
    }

    /* JADX INFO: renamed from: m3 */
    public static void m5403m3(int i, int i2, int i3) {
        String strM5428r3;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM5428r3 = m5428r3(i, i3, "start index");
            } else {
                strM5428r3 = (i2 < 0 || i2 > i3) ? m5428r3(i2, i3, "end index") : m5302Q2("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM5428r3);
        }
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: n */
    public static Bundle m5404n(@RecentlyNonNull Parcel parcel, int i) {
        int iM5277L = m5277L(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM5277L == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM5277L);
        return bundle;
    }

    /* JADX INFO: renamed from: n0 */
    public static long m5405n0(ByteBuffer byteBuffer) {
        long j2 = byteBuffer.getInt();
        return j2 < 0 ? j2 + 4294967296L : j2;
    }

    /* JADX INFO: renamed from: n1 */
    public static boolean m5406n1(String str) {
        return "audio".equals(m5437t2(str));
    }

    /* JADX INFO: renamed from: n2 */
    public static sh1 m5407n2(jw2 jw2Var) {
        return jw2Var.f15843n ? new sh1(-3, 0, true) : new sh1(jw2Var.f15839j, jw2Var.f15836g, false);
    }

    /* JADX INFO: renamed from: n3 */
    public static void m5408n3(String str) {
        if (m5281L3(6)) {
            Log.e("Ads", str);
        }
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: o */
    public static byte[] m5409o(@RecentlyNonNull Parcel parcel, int i) {
        int iM5277L = m5277L(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM5277L == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM5277L);
        return bArrCreateByteArray;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Intent m5410o0(Uri uri, Context context) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    /* JADX INFO: renamed from: o1 */
    public static byte[] m5411o1(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            byte b2 = (byte) ((b + b) & 254);
            bArr2[i] = b2;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i + 1] >> 7) & 1) | b2);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    /* JADX INFO: renamed from: o2 */
    public static final <O> ol1<O> m5412o2(Callable<O> callable, lv1 lv1Var, Object obj, pl1 pl1Var) {
        return new ol1<>(pl1Var, obj, pl1.f18024a, Collections.emptyList(), lv1Var.mo6691u0(callable));
    }

    /* JADX INFO: renamed from: o3 */
    public static void m5413o3(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: p */
    public static int[] m5414p(@RecentlyNonNull Parcel parcel, int i) {
        int iM5277L = m5277L(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM5277L == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iM5277L);
        return iArrCreateIntArray;
    }

    /* JADX INFO: renamed from: p0 */
    public static Bundle m5415p0(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    /* JADX INFO: renamed from: p1 */
    public static byte[] m5416p1(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (i > Integer.MAX_VALUE - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i += length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i2, length2);
            i2 += length2;
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: p2 */
    public static yv2 m5417p2(int i, yv2 yv2Var) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14261R4)).intValue() > 0) {
                return yv2Var;
            }
            i = 8;
        }
        return m5285M2(i, null, yv2Var);
    }

    /* JADX INFO: renamed from: p3 */
    public static int m5418p3(byte[] bArr, int i, w62 w62Var) throws r82 {
        int iM5390k0 = m5390k0(bArr, i, w62Var);
        int i2 = w62Var.f21009a;
        if (i2 < 0) {
            throw r82.m8261b();
        }
        if (i2 == 0) {
            w62Var.f21011c = "";
            return iM5390k0;
        }
        w62Var.f21011c = cb2.m6160d(bArr, iM5390k0, i2);
        return iM5390k0 + i2;
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: q */
    public static long[] m5419q(@RecentlyNonNull Parcel parcel, int i) {
        int iM5277L = m5277L(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM5277L == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iM5277L);
        return jArrCreateLongArray;
    }

    /* JADX INFO: renamed from: q0 */
    public static <R extends InterfaceC2638k, T> AbstractC2634g<R> m5420q0(AbstractC4781i<T> abstractC4781i, final InterfaceC3998t<R, T> interfaceC3998t, final InterfaceC3998t<R, Status> interfaceC3998t2) {
        final C4007u c4007u = new C4007u(interfaceC3998t2);
        InterfaceC4775f interfaceC4775f = new InterfaceC4775f(c4007u, interfaceC3998t) { // from class: c.n.b.d.j.f.r

            /* JADX INFO: renamed from: a */
            public final C4007u f22855a;

            /* JADX INFO: renamed from: b */
            public final InterfaceC3998t f22856b;

            {
                this.f22855a = c4007u;
                this.f22856b = interfaceC3998t;
            }

            @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4775f
            /* JADX INFO: renamed from: a */
            public final void mo5107a(Object obj) {
                this.f22855a.mo4931a(this.f22856b.mo9108a(obj));
            }
        };
        C4778g0 c4778g0 = (C4778g0) abstractC4781i;
        Objects.requireNonNull(c4778g0);
        Executor executor = C4783k.f24684a;
        c4778g0.mo10932e(executor, interfaceC4775f);
        c4778g0.mo10931d(executor, new InterfaceC4773e(c4007u, interfaceC3998t2) { // from class: c.n.b.d.j.f.q

            /* JADX INFO: renamed from: a */
            public final C4007u f22841a;

            /* JADX INFO: renamed from: b */
            public final InterfaceC3998t f22842b;

            {
                this.f22841a = c4007u;
                this.f22842b = interfaceC3998t2;
            }

            @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4773e
            /* JADX INFO: renamed from: c */
            public final void mo8822c(Exception exc) {
                C4007u c4007u2 = this.f22841a;
                InterfaceC3998t interfaceC3998t3 = this.f22842b;
                Status status = new Status(8, "unknown error");
                if (exc instanceof C2629b) {
                    C2629b c2629b = (C2629b) exc;
                    status = new Status(c2629b.f11608f.f28654l, c2629b.getMessage());
                }
                c4007u2.mo4931a(interfaceC3998t3.mo9108a(status));
            }
        });
        return c4007u;
    }

    /* JADX INFO: renamed from: q1 */
    public static Object[] m5421q1(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m5284M1(objArr[i2], i2);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: q2 */
    public static File m5422q2(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        m5290N2(file2, false);
        return file2;
    }

    /* JADX INFO: renamed from: q3 */
    public static String m5423q3(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(outline.m1585g(44, "Unknown content digest algorthm: ", i));
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: r */
    public static <T extends Parcelable> T m5424r(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int iM5277L = m5277L(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM5277L == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM5277L);
        return tCreateFromParcel;
    }

    /* JADX INFO: renamed from: r0 */
    public static <T> q30<T> m5425r0(ws0 ws0Var, ii1 ii1Var, yl1 yl1Var, C3675wx c3675wx, u01<T> u01Var, ba0 ba0Var, di1 di1Var, yt0 yt0Var, o50 o50Var, Executor executor, mt0 mt0Var, hx0 hx0Var) {
        return new q30<>(ws0Var, ii1Var, yl1Var, c3675wx, u01Var, ba0Var, di1Var, yt0Var, o50Var, executor, mt0Var, hx0Var);
    }

    /* JADX INFO: renamed from: r1 */
    public static X509Certificate[][] m5426r1(String str) throws SecurityException, IOException, jd2 {
        Pair<ByteBuffer, Long> pairM5353c3;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                pairM5353c3 = null;
            } else {
                pairM5353c3 = m5353c3(randomAccessFile, 0);
                if (pairM5353c3 == null) {
                    pairM5353c3 = m5353c3(randomAccessFile, 65535);
                }
            }
            if (pairM5353c3 == null) {
                long length = randomAccessFile.length();
                StringBuilder sb = new StringBuilder(102);
                sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb.append(length);
                sb.append(" bytes");
                throw new jd2(sb.toString());
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairM5353c3.first;
            long jLongValue = ((Long) pairM5353c3.second).longValue();
            long j2 = (-20) + jLongValue;
            if (j2 >= 0) {
                randomAccessFile.seek(j2);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new jd2("ZIP64 APK not supported");
                }
            }
            m5413o3(byteBuffer);
            long j3 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
            if (j3 >= jLongValue) {
                StringBuilder sb2 = new StringBuilder(122);
                sb2.append("ZIP Central Directory offset out of range: ");
                sb2.append(j3);
                sb2.append(". ZIP End of Central Directory offset: ");
                sb2.append(jLongValue);
                throw new jd2(sb2.toString());
            }
            m5413o3(byteBuffer);
            if ((((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L) + j3 != jLongValue) {
                throw new jd2("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j3 < 32) {
                StringBuilder sb3 = new StringBuilder(87);
                sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                sb3.append(j3);
                throw new jd2(sb3.toString());
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(j3 - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new jd2("No APK Signing Block before ZIP Central Directory");
            }
            long j4 = byteBufferAllocate.getLong(0);
            if (j4 < byteBufferAllocate.capacity() || j4 > 2147483639) {
                StringBuilder sb4 = new StringBuilder(57);
                sb4.append("APK Signing Block size out of range: ");
                sb4.append(j4);
                throw new jd2(sb4.toString());
            }
            int i = (int) (8 + j4);
            long j5 = j3 - ((long) i);
            if (j5 < 0) {
                StringBuilder sb5 = new StringBuilder(59);
                sb5.append("APK Signing Block offset out of range: ");
                sb5.append(j5);
                throw new jd2(sb5.toString());
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j5);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j6 = byteBufferAllocate2.getLong(0);
            if (j6 != j4) {
                StringBuilder sb6 = new StringBuilder(103);
                sb6.append("APK Signing Block sizes in header and footer do not match: ");
                sb6.append(j6);
                sb6.append(" vs ");
                sb6.append(j4);
                throw new jd2(sb6.toString());
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j5));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                StringBuilder sb7 = new StringBuilder(38);
                sb7.append("end < start: ");
                sb7.append(iCapacity);
                sb7.append(" < ");
                sb7.append(8);
                throw new IllegalArgumentException(sb7.toString());
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                StringBuilder sb8 = new StringBuilder(41);
                sb8.append("end > capacity: ");
                sb8.append(iCapacity);
                sb8.append(" > ");
                sb8.append(iCapacity2);
                throw new IllegalArgumentException(sb8.toString());
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                int i2 = 0;
                while (byteBufferSlice.hasRemaining()) {
                    i2++;
                    if (byteBufferSlice.remaining() < 8) {
                        StringBuilder sb9 = new StringBuilder(70);
                        sb9.append("Insufficient data to read size of APK Signing Block entry #");
                        sb9.append(i2);
                        throw new jd2(sb9.toString());
                    }
                    long j7 = byteBufferSlice.getLong();
                    if (j7 < 4 || j7 > 2147483647L) {
                        StringBuilder sb10 = new StringBuilder(76);
                        sb10.append("APK Signing Block entry #");
                        sb10.append(i2);
                        sb10.append(" size out of range: ");
                        sb10.append(j7);
                        throw new jd2(sb10.toString());
                    }
                    int i3 = (int) j7;
                    int iPosition2 = byteBufferSlice.position() + i3;
                    if (i3 > byteBufferSlice.remaining()) {
                        int iRemaining = byteBufferSlice.remaining();
                        StringBuilder sb11 = new StringBuilder(91);
                        sb11.append("APK Signing Block entry #");
                        sb11.append(i2);
                        sb11.append(" size out of range: ");
                        sb11.append(i3);
                        sb11.append(", available: ");
                        sb11.append(iRemaining);
                        throw new jd2(sb11.toString());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrM5357d2 = m5357d2(randomAccessFile.getChannel(), new nq1(m5468z3(byteBufferSlice, i3 - 4), jLongValue2, j3, jLongValue, byteBuffer));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return x509CertificateArrM5357d2;
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new jd2("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    @NonNullDecl
    /* JADX INFO: renamed from: r2 */
    public static <T> T m5427r2(@NonNullDecl T t, @NullableDecl String str, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(m5302Q2(str, obj));
    }

    /* JADX INFO: renamed from: r3 */
    public static String m5428r3(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return m5302Q2("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return m5302Q2("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(outline.m1585g(26, "negative size: ", i2));
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: s */
    public static String m5429s(@RecentlyNonNull Parcel parcel, int i) {
        int iM5277L = m5277L(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM5277L == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM5277L);
        return string;
    }

    /* JADX INFO: renamed from: s0 */
    public static f31 m5430s0(Context context, String str, String str2) {
        f31 f31VarPoll;
        try {
            f31VarPoll = new sp1(context, str, str2).f19650d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            f31VarPoll = null;
        }
        return f31VarPoll == null ? sp1.m8359b() : f31VarPoll;
    }

    /* JADX INFO: renamed from: s1 */
    public static int m5431s1(int i) {
        int[] iArr = {1, 2, 3, 4, 5};
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: s2 */
    public static String m5432s2(AbstractC3823b4 abstractC3823b4) {
        C3916k7 c3916k7 = new C3916k7(abstractC3823b4);
        StringBuilder sb = new StringBuilder(abstractC3823b4.size());
        for (int i = 0; i < c3916k7.f22725a.size(); i++) {
            byte bMo8948h = c3916k7.f22725a.mo8948h(i);
            if (bMo8948h == 34) {
                sb.append("\\\"");
            } else if (bMo8948h == 39) {
                sb.append("\\'");
            } else if (bMo8948h != 92) {
                switch (bMo8948h) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo8948h < 32 || bMo8948h > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo8948h >>> 6) & 3) + 48));
                            sb.append((char) (((bMo8948h >>> 3) & 7) + 48));
                            sb.append((char) ((bMo8948h & 7) + 48));
                        } else {
                            sb.append((char) bMo8948h);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: s3 */
    public static void m5433s3(Bundle bundle, String str, List<String> list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: t */
    public static String[] m5434t(@RecentlyNonNull Parcel parcel, int i) {
        int iM5277L = m5277L(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM5277L == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iM5277L);
        return strArrCreateStringArray;
    }

    /* JADX INFO: renamed from: t0 */
    public static final <O> ol1<O> m5435t0(kv1<O> kv1Var, Object obj, pl1 pl1Var) {
        return new ol1<>(pl1Var, obj, pl1.f18024a, Collections.emptyList(), kv1Var);
    }

    /* JADX INFO: renamed from: t1 */
    public static final String m5436t1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: t2 */
    public static String m5437t2(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException(str.length() != 0 ? "Invalid mime type: ".concat(str) : new String("Invalid mime type: "));
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: t3 */
    public static void m5438t3(String str, Throwable th) {
        if (m5281L3(6)) {
            Log.e("Ads", str, th);
        }
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: u */
    public static ArrayList<String> m5439u(@RecentlyNonNull Parcel parcel, int i) {
        int iM5277L = m5277L(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM5277L == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iM5277L);
        return arrayListCreateStringArrayList;
    }

    /* JADX INFO: renamed from: u0 */
    public static er1 m5440u0(Context context, int i, zf2 zf2Var, String str, String str2, np1 np1Var) {
        er1 er1VarPoll;
        tp1 tp1Var = new tp1(context, 1, zf2Var, str, str2, "1", np1Var);
        try {
            er1VarPoll = tp1Var.f19948e.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            tp1Var.m8441c(2009, tp1Var.f19951h, e);
            er1VarPoll = null;
        }
        tp1Var.m8441c(3004, tp1Var.f19951h, null);
        if (er1VarPoll != null) {
            if (er1VarPoll.f13675h == 7) {
                np1.f17211a = fb0.DISABLED;
            } else {
                np1.f17211a = fb0.ENABLED;
            }
        }
        return er1VarPoll == null ? tp1.m8439b() : er1VarPoll;
    }

    /* JADX INFO: renamed from: u1 */
    public static void m5441u1(String str) {
        if (jo2.f15673a >= 18) {
            Trace.beginSection(str);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public static void m5442u2(Bundle bundle, String str, Integer num, boolean z) {
        if (z) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static boolean m5443u3(byte b) {
        return b > -65;
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: v */
    public static <T> T[] m5444v(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int iM5277L = m5277L(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM5277L == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM5277L);
        return tArr;
    }

    /* JADX INFO: renamed from: v0 */
    public static lv1 m5445v0() {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14433r3;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            return C2962do.f13332c;
        }
        return ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14426q3)).booleanValue() ? C2962do.f13330a : C2962do.f13334e;
    }

    /* JADX INFO: renamed from: v1 */
    public static final void m5446v1(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m5446v1(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m5446v1(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            AbstractC4402x3 abstractC4402x3 = AbstractC4402x3.f23614f;
            sb.append(m5273K0(new C4126d4(((String) obj).getBytes(C4127d5.f23112a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC4402x3) {
            sb.append(": \"");
            sb.append(m5273K0((AbstractC4402x3) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC4099b5) {
            sb.append(" {");
            m5332Y0((AbstractC4099b5) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        m5446v1(sb, i4, "key", entry.getKey());
        m5446v1(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    /* JADX INFO: renamed from: v2 */
    public static void m5447v2(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX INFO: renamed from: v3 */
    public static int m5448v3(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(outline.m1585g(44, "Unknown content digest algorthm: ", i));
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: w */
    public static <T> ArrayList<T> m5449w(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int iM5277L = m5277L(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM5277L == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM5277L);
        return arrayListCreateTypedArrayList;
    }

    @Deprecated
    /* JADX INFO: renamed from: w0 */
    public static gw1 m5450w0(nw1 nw1Var) throws GeneralSecurityException {
        byte[] bArrArray;
        cx1.m6261e(new cz1());
        h32 h32Var = h32.ENABLED;
        uw1<?, ?> uw1Var = cx1.f13147f.get(gw1.class);
        Class<?> clsMo5894b = uw1Var == null ? null : uw1Var.mo5894b();
        if (clsMo5894b == null) {
            String name = gw1.class.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
        }
        s32 s32Var = nw1Var.f17467a;
        int i = dx1.f13419a;
        int iM8343v = s32Var.m8343v();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (r32 r32Var : s32Var.m8344x()) {
            if (r32Var.m8250y() == h32Var) {
                if (!r32Var.m8248v()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(r32Var.m8251z())));
                }
                if (r32Var.m8247A() == l42.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(r32Var.m8251z())));
                }
                if (r32Var.m8250y() == h32.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(r32Var.m8251z())));
                }
                if (r32Var.m8251z() == iM8343v) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= r32Var.m8249x().m6778y() == e32.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        tw1<?> tw1Var = new tw1<>(clsMo5894b);
        for (r32 r32Var2 : nw1Var.f17467a.m8344x()) {
            if (r32Var2.m8250y() == h32Var) {
                f32 f32VarM8249x = r32Var2.m8249x();
                Object objM6267k = cx1.m6267k(f32VarM8249x.m6776v(), f32VarM8249x.m6777x(), clsMo5894b);
                if (r32Var2.m8250y() != h32Var) {
                    throw new GeneralSecurityException("only ENABLED key is allowed");
                }
                int iOrdinal = r32Var2.m8247A().ordinal();
                if (iOrdinal == 1) {
                    bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(r32Var2.m8251z()).array();
                } else if (iOrdinal == 2) {
                    bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(r32Var2.m8251z()).array();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(r32Var2.m8251z()).array();
                } else {
                    bArrArray = dw1.f13408a;
                }
                rw1<P> rw1Var = new rw1<>(objM6267k, bArrArray, r32Var2.m8250y(), r32Var2.m8247A());
                ArrayList arrayList = new ArrayList();
                arrayList.add(rw1Var);
                sw1 sw1Var = new sw1(rw1Var.m8334a());
                List<rw1<?>> listPut = tw1Var.f20172a.put(sw1Var, Collections.unmodifiableList(arrayList));
                if (listPut != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(listPut);
                    arrayList2.add(rw1Var);
                    tw1Var.f20172a.put(sw1Var, Collections.unmodifiableList(arrayList2));
                }
                if (r32Var2.m8251z() != nw1Var.f17467a.m8343v()) {
                    continue;
                } else {
                    if (rw1Var.f19410c != h32Var) {
                        throw new IllegalArgumentException("the primary entry has to be ENABLED");
                    }
                    List<rw1<?>> listEmptyList = tw1Var.f20172a.get(new sw1(rw1Var.m8334a()));
                    if (listEmptyList == null) {
                        listEmptyList = Collections.emptyList();
                    }
                    if (listEmptyList.isEmpty()) {
                        throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                    }
                    tw1Var.f20173b = rw1Var;
                }
            }
        }
        uw1<?, ?> uw1Var2 = cx1.f13147f.get(gw1.class);
        if (uw1Var2 == null) {
            String name2 = tw1Var.f20174c.getName();
            throw new GeneralSecurityException(name2.length() != 0 ? "No wrapper found for ".concat(name2) : new String("No wrapper found for "));
        }
        if (uw1Var2.mo5894b().equals(tw1Var.f20174c)) {
            return (gw1) uw1Var2.mo5895c(tw1Var);
        }
        String strValueOf = String.valueOf(uw1Var2.mo5894b());
        String strValueOf2 = String.valueOf(tw1Var.f20174c);
        throw new GeneralSecurityException(outline.m1553D(new StringBuilder(strValueOf.length() + 44 + strValueOf2.length()), "Wrong input primitive class, expected ", strValueOf, ", got ", strValueOf2));
    }

    /* JADX INFO: renamed from: w1 */
    public static boolean m5451w1() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: w2 */
    public static void m5452w2(InterfaceC3615va interfaceC3615va, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        String strValueOf = String.valueOf(sb.toString());
        m5318U2(strValueOf.length() != 0 ? "Dispatching AFMA event: ".concat(strValueOf) : new String("Dispatching AFMA event: "));
        interfaceC3615va.mo6478f(sb.toString());
    }

    /* JADX INFO: renamed from: w3 */
    public static int m5453w3(byte[] bArr, int i, w62 w62Var) throws r82 {
        int iM5390k0 = m5390k0(bArr, i, w62Var);
        int i2 = w62Var.f21009a;
        if (i2 < 0) {
            throw r82.m8261b();
        }
        if (i2 > bArr.length - iM5390k0) {
            throw r82.m8260a();
        }
        if (i2 == 0) {
            w62Var.f21011c = g72.f14513f;
            return iM5390k0;
        }
        w62Var.f21011c = g72.m6939G(bArr, iM5390k0, i2);
        return iM5390k0 + i2;
    }

    /* JADX INFO: renamed from: x */
    public static void m5454x(@RecentlyNonNull Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new C2768b(outline.m1585g(37, "Overread allowed size end=", i), parcel);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: x0 */
    public static final nw1 m5455x0(byte[] bArr) throws GeneralSecurityException {
        try {
            s32 s32VarM8342z = s32.m8342z(bArr, s72.m8347a());
            for (r32 r32Var : s32VarM8342z.m8344x()) {
                if (r32Var.m8249x().m6778y() == e32.UNKNOWN_KEYMATERIAL || r32Var.m8249x().m6778y() == e32.SYMMETRIC || r32Var.m8249x().m6778y() == e32.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            if (s32VarM8342z.m8345y() > 0) {
                return new nw1(s32VarM8342z);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (r82 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m5456x1(byte b) {
        return b >= 0;
    }

    /* JADX INFO: renamed from: x2 */
    public static void m5457x2(rn1 rn1Var, on1 on1Var, qn1 qn1Var) {
        rn1 rn1Var2 = rn1.NATIVE;
        if (rn1Var == rn1.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (on1Var == on1.DEFINED_BY_JAVASCRIPT && rn1Var == rn1Var2) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (qn1Var == qn1.DEFINED_BY_JAVASCRIPT && rn1Var == rn1Var2) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* JADX INFO: renamed from: x3 */
    public static void m5458x3(String str) {
        if (m5281L3(4)) {
            Log.i("Ads", str);
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m5459y(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: y0 */
    public static hj2 m5460y0(lv2 lv2Var) {
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = lv2Var.f16618c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jM5254G1 = str != null ? m5254G1(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            int i2 = 0;
            j2 = 0;
            j3 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = map.get("Expires");
        long jM5254G2 = str3 != null ? m5254G1(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long jM5254G3 = str4 != null ? m5254G1(str4) : 0L;
        String str5 = map.get("ETag");
        if (z) {
            j5 = jCurrentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j6 = j5;
            } else {
                Long.signum(j3);
                j6 = (j3 * 1000) + j5;
            }
            j4 = j6;
        } else {
            j4 = 0;
            if (jM5254G1 <= 0 || jM5254G2 < jM5254G1) {
                j5 = 0;
            } else {
                j5 = jCurrentTimeMillis + (jM5254G2 - jM5254G1);
                j4 = j5;
            }
        }
        hj2 hj2Var = new hj2();
        hj2Var.f14877a = lv2Var.f16617b;
        hj2Var.f14878b = str5;
        hj2Var.f14882f = j5;
        hj2Var.f14881e = j4;
        hj2Var.f14879c = jM5254G1;
        hj2Var.f14880d = jM5254G3;
        hj2Var.f14883g = map;
        hj2Var.f14884h = lv2Var.f16619d;
        return hj2Var;
    }

    /* JADX INFO: renamed from: y1 */
    public static boolean m5461y1(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: y2 */
    public static void m5462y2(l92 l92Var, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : l92Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m5317U1(sb, i, m5294O2(strConcat), g82.m6951j(method2, l92Var, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m5317U1(sb, i, m5294O2(strConcat2), g82.m6951j(method3, l92Var, new Object[0]));
                }
            }
            if (((Method) map2.get(strSubstring.length() != 0 ? "set".concat(strSubstring) : new String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                Method method4 = (Method) map.get(strSubstring.length() != 0 ? "get".concat(strSubstring) : new String("get"));
                Method method5 = (Method) map.get(strSubstring.length() != 0 ? "has".concat(strSubstring) : new String("has"));
                if (method4 != null) {
                    Object objM6951j = g82.m6951j(method4, l92Var, new Object[0]);
                    if (method5 == null) {
                        if (objM6951j instanceof Boolean) {
                            if (((Boolean) objM6951j).booleanValue()) {
                                m5317U1(sb, i, m5294O2(strConcat3), objM6951j);
                            }
                        } else if (objM6951j instanceof Integer) {
                            if (((Integer) objM6951j).intValue() != 0) {
                                m5317U1(sb, i, m5294O2(strConcat3), objM6951j);
                            }
                        } else if (objM6951j instanceof Float) {
                            if (((Float) objM6951j).floatValue() != 0.0f) {
                                m5317U1(sb, i, m5294O2(strConcat3), objM6951j);
                            }
                        } else if (!(objM6951j instanceof Double)) {
                            if (objM6951j instanceof String) {
                                zEquals = objM6951j.equals("");
                            } else if (objM6951j instanceof g72) {
                                zEquals = objM6951j.equals(g72.f14513f);
                            } else if (objM6951j instanceof l92) {
                                if (objM6951j != ((l92) objM6951j).mo6294g()) {
                                    m5317U1(sb, i, m5294O2(strConcat3), objM6951j);
                                }
                            } else if (!(objM6951j instanceof Enum) || ((Enum) objM6951j).ordinal() != 0) {
                                m5317U1(sb, i, m5294O2(strConcat3), objM6951j);
                            }
                            if (!zEquals) {
                                m5317U1(sb, i, m5294O2(strConcat3), objM6951j);
                            }
                        } else if (((Double) objM6951j).doubleValue() != 0.0d) {
                            m5317U1(sb, i, m5294O2(strConcat3), objM6951j);
                        }
                    } else if (((Boolean) g82.m6951j(method5, l92Var, new Object[0])).booleanValue()) {
                        m5317U1(sb, i, m5294O2(strConcat3), objM6951j);
                    }
                }
            }
        }
        if (l92Var instanceof e82) {
            throw null;
        }
        pa2 pa2Var = ((g82) l92Var).zzc;
        if (pa2Var != null) {
            for (int i2 = 0; i2 < pa2Var.f17891b; i2++) {
                m5317U1(sb, i, String.valueOf(pa2Var.f17892c[i2] >>> 3), pa2Var.f17893d[i2]);
            }
        }
    }

    /* JADX INFO: renamed from: y3 */
    public static int m5463y3(ba2 ba2Var, byte[] bArr, int i, int i2, w62 w62Var) throws IOException {
        int iM5234C1 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM5234C1 = m5234C1(i3, bArr, iM5234C1, w62Var);
            i3 = w62Var.f21009a;
        }
        int i4 = iM5234C1;
        if (i3 < 0 || i3 > i2 - i4) {
            throw r82.m8260a();
        }
        Object objZza = ba2Var.zza();
        int i5 = i3 + i4;
        ba2Var.mo5956l(objZza, bArr, i4, i5, w62Var);
        ba2Var.mo5952h(objZza);
        w62Var.f21011c = objZza;
        return i5;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m5464z() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: renamed from: z0 */
    public static yv2 m5465z0(Throwable th) {
        if (th instanceof gx0) {
            gx0 gx0Var = (gx0) th;
            return m5417p2(gx0Var.f17727f, gx0Var.f14691g);
        }
        if (th instanceof or0) {
            return th.getMessage() == null ? m5285M2(((or0) th).f17727f, null, null) : m5285M2(((or0) th).f17727f, th.getMessage(), null);
        }
        if (!(th instanceof C2292q)) {
            return m5285M2(1, null, null);
        }
        C2292q c2292q = (C2292q) th;
        return new yv2(c2292q.f10765f, m5278L0(c2292q.getMessage()), "com.google.android.gms.ads", null, null);
    }

    /* JADX INFO: renamed from: z1 */
    public static int m5466z1(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: z2 */
    public static <T> void m5467z2(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    /* JADX INFO: renamed from: z3 */
    public static ByteBuffer m5468z3(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i < 0) {
            throw new IllegalArgumentException(outline.m1585g(17, "size: ", i));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }
}
