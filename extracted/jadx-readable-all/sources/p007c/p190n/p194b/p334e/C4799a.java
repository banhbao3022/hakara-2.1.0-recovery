package p007c.p190n.p194b.p334e;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewParent;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.p353n.CircularRevealWidget;
import p007c.p190n.p194b.p334e.p357q.ElevationOverlayProvider;
import p007c.p190n.p194b.p334e.p360t.ViewUtils2;
import p007c.p190n.p194b.p334e.p360t.ViewUtils3;
import p007c.p190n.p194b.p334e.p360t.ViewUtils4;
import p007c.p190n.p194b.p334e.p362v.MaterialAttributes;
import p007c.p190n.p194b.p334e.p365y.CornerTreatment;
import p007c.p190n.p194b.p334e.p365y.CutCornerTreatment;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.RoundedCornerTreatment;
import p007c.p190n.p194b.p367f.p368a.p370b.C4999f0;
import p007c.p190n.p194b.p367f.p368a.p370b.C5001f2;
import p007c.p190n.p194b.p367f.p368a.p373d.AbstractC5118u;
import p007c.p190n.p194b.p367f.p368a.p373d.C5084c0;
import p007c.p190n.p194b.p367f.p368a.p373d.C5117t;
import p007c.p190n.p194b.p367f.p368a.p373d.C5119v;
import p007c.p190n.p194b.p367f.p368a.p377h.AbstractC5141e;
import p007c.p190n.p194b.p367f.p368a.p377h.C5142f;
import p007c.p190n.p194b.p367f.p368a.p377h.C5156t;
import p007c.p190n.p378c.p380b.Collections2;
import p007c.p190n.p378c.p380b.Sets2;
import p007c.p190n.p378c.p382d.Ints;
import p007c.p190n.p385d.p390k.Component3;
import p007c.p190n.p385d.p390k.ComponentContainer;
import p007c.p190n.p385d.p390k.ComponentFactory;
import p007c.p190n.p385d.p390k.CycleDetector2;
import p007c.p190n.p385d.p390k.CycleDetector3;
import p007c.p190n.p385d.p390k.Dependency;
import p007c.p190n.p385d.p390k.DependencyCycleException;
import p007c.p190n.p385d.p391l.p392e.p395k.ExecutorUtils;
import p007c.p190n.p385d.p391l.p392e.p395k.ExecutorUtils2;
import p007c.p190n.p385d.p429x.AutoValue_LibraryVersion;
import p007c.p190n.p385d.p429x.LibraryVersion;
import p007c.p190n.p385d.p429x.LibraryVersionComponent2;
import p007c.p190n.p438f.p448n.p450c.ByteMatrix;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p644b.p653h.TintTypedArray;
import p636z0.p725k.p729e.ColorUtils;
import p636z0.p725k.p739l.OnApplyWindowInsetsListener;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.WindowInsetsCompat;

/* JADX INFO: renamed from: c.n.b.e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4799a {

    /* JADX INFO: renamed from: a */
    public static C4999f0 f24725a;

    /* JADX INFO: renamed from: c.n.b.e.a$a */
    /* JADX INFO: compiled from: ViewUtils.java */
    public static class a implements OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewUtils3 f24726a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewUtils4 f24727b;

        public a(ViewUtils3 viewUtils3, ViewUtils4 viewUtils4) {
            this.f24726a = viewUtils3;
            this.f24727b = viewUtils4;
        }

        @Override // p636z0.p725k.p739l.OnApplyWindowInsetsListener
        /* JADX INFO: renamed from: a */
        public WindowInsetsCompat mo307a(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f24726a.mo11121a(view, windowInsetsCompat, new ViewUtils4(this.f24727b));
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m10950A(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: B */
    public static String m10951B(String str, String str2) {
        return outline.m1552C(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m10952C(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: D */
    public static boolean m10953D(CharSequence charSequence, CharSequence charSequence2) {
        char c2;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence2.charAt(i);
            if (cCharAt != cCharAt2 && ((c2 = (char) ((cCharAt | ' ') - 97)) >= 26 || c2 != ((char) ((cCharAt2 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public static String m10954E(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(outline.m1578b(str.length(), 2, String.valueOf(str2).length(), String.valueOf(str3).length()));
        outline.m1572W(sb, str, ":", str2, ":");
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: F */
    public static boolean m10955F(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* JADX INFO: renamed from: G */
    public static int m10956G(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            iArr[i2] = (int) Math.ceil(fArr[i2]);
            int i3 = iArr[i2];
            if (i > i3) {
                Arrays.fill(bArr, (byte) 0);
                i = i3;
            }
            if (i == i3) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: H */
    public static Component3<?> m10957H(final String str, final LibraryVersionComponent2<Context> libraryVersionComponent2) {
        Component3.b bVarM11686a = Component3.m11686a(LibraryVersion.class);
        bVarM11686a.f26364d = 1;
        bVarM11686a.m11689a(new Dependency(Context.class, 1, 0));
        bVarM11686a.m11691c(new ComponentFactory(str, libraryVersionComponent2) { // from class: c.n.d.x.f

            /* JADX INFO: renamed from: a */
            public final String f27311a;

            /* JADX INFO: renamed from: b */
            public final LibraryVersionComponent2 f27312b;

            {
                this.f27311a = str;
                this.f27312b = libraryVersionComponent2;
            }

            @Override // p007c.p190n.p385d.p390k.ComponentFactory
            /* JADX INFO: renamed from: a */
            public Object mo11679a(ComponentContainer componentContainer) {
                return new AutoValue_LibraryVersion(this.f27311a, this.f27312b.mo11674a((Context) componentContainer.mo11684a(Context.class)));
            }
        });
        return bVarM11686a.m11690b();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m10958I(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    /* JADX INFO: renamed from: J */
    public static int m10959J(Context context, int i, int i2) {
        TypedValue typedValueM11349a = MaterialAttributes.m11349a(context, i);
        return typedValueM11349a != null ? typedValueM11349a.data : i2;
    }

    /* JADX INFO: renamed from: K */
    public static int m10960K(View view, int i) {
        return MaterialAttributes.m11351c(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* JADX INFO: renamed from: L */
    public static ColorStateList m10961L(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM14706a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM14706a = AppCompatResources.m14706a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM14706a;
    }

    /* JADX INFO: renamed from: M */
    public static ColorStateList m10962M(Context context, TintTypedArray tintTypedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM14706a;
        return (!tintTypedArray.f35267b.hasValue(i) || (resourceId = tintTypedArray.f35267b.getResourceId(i, 0)) == 0 || (colorStateListM14706a = AppCompatResources.m14706a(context, resourceId)) == null) ? tintTypedArray.m15001c(i) : colorStateListM14706a;
    }

    /* JADX INFO: renamed from: N */
    public static Drawable m10963N(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM14707b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM14707b = AppCompatResources.m14707b(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM14707b;
    }

    @NullableDecl
    /* JADX INFO: renamed from: O */
    public static <T> T m10964O(Iterable<? extends T> iterable, @NullableDecl T t) {
        Sets2 sets2 = new Sets2((Collections2.a) iterable);
        return sets2.hasNext() ? (T) sets2.next() : t;
    }

    /* JADX INFO: renamed from: P */
    public static <T> T m10965P(Iterable<T> iterable) {
        T next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<T> it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX INFO: renamed from: Q */
    public static void m10966Q(PackageManager packageManager, ComponentName componentName, int i) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i | 512);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i2 = 0;
                    loop0: while (true) {
                        if (i2 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i2];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                componentInfo = componentInfoArr2[i3];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                        }
                        i2++;
                    }
                    if (componentInfo != null && componentInfo.isEnabled()) {
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    /* JADX INFO: renamed from: R */
    public static boolean m10967R(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    /* JADX INFO: renamed from: S */
    public static int m10968S(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX INFO: renamed from: T */
    public static boolean m10969T(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6 && i2 != 6 && i2 != 5) {
            return true;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static void m10970U(char c2) {
        String hexString = Integer.toHexString(c2);
        throw new IllegalArgumentException("Illegal character: " + c2 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    /* JADX INFO: renamed from: V */
    public static boolean m10971V(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    /* JADX INFO: renamed from: W */
    public static boolean m10972W(char c2) {
        return c2 >= 128 && c2 <= 255;
    }

    /* JADX INFO: renamed from: X */
    public static boolean m10973X(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m10974Y(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m10975Z(View view) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        return view.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: a */
    public static String m10976a(List<File> list) throws NoSuchAlgorithmException, IOException {
        int i;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream(it.next());
            do {
                try {
                    i = fileInputStream.read(bArr);
                    if (i > 0) {
                        messageDigest.update(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        C5084c0.f26038a.mo11527a(th, th2);
                    }
                    throw th;
                }
            } while (i != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m10977a0(char c2) {
        if (m10983d0(c2) || c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m10978b(ByteMatrix byteMatrix, boolean z) {
        int i = z ? byteMatrix.f27801c : byteMatrix.f27800b;
        int i2 = z ? byteMatrix.f27800b : byteMatrix.f27801c;
        byte[][] bArr = byteMatrix.f27799a;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b2 = z ? bArr[i4][i6] : bArr[i6][i4];
                if (b2 == b) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += (i5 - 5) + 3;
                    }
                    b = b2;
                    i5 = 1;
                }
            }
            if (i5 >= 5) {
                i3 = (i5 - 5) + 3 + i3;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m10979b0(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, bArr.length);
        for (int iMax = Math.max(i, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static <ResultT> ResultT m10980c(AbstractC5141e<ResultT> abstractC5141e) throws ExecutionException, InterruptedException {
        Objects.requireNonNull(abstractC5141e, "Task must not be null");
        if (abstractC5141e.mo11567e()) {
            return (ResultT) m10986f(abstractC5141e);
        }
        C5156t c5156t = new C5156t(null);
        Executor executor = C5142f.f26097b;
        abstractC5141e.mo11564b(executor, c5156t);
        abstractC5141e.mo11563a(executor, c5156t);
        c5156t.f26123a.await();
        return (ResultT) m10986f(abstractC5141e);
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m10981c0(byte[][] bArr, int i, int i2, int i3) {
        int iMin = Math.min(i3, bArr.length);
        for (int iMax = Math.max(i2, 0); iMax < iMin; iMax++) {
            if (bArr[iMax][i] == 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static String m10982d(int i, int i2, @NullableDecl String str) {
        if (i < 0) {
            return m10991h0("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return m10991h0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(outline.m1590l("negative size: ", i2));
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m10983d0(char c2) {
        return c2 == '\r' || c2 == '*' || c2 == '>';
    }

    /* JADX INFO: renamed from: e */
    public static ExecutorService m10984e(String str) {
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ExecutorUtils(str, new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread(new ExecutorUtils2(str, executorServiceUnconfigurableExecutorService, 2L, TimeUnit.SECONDS), outline.m1599u("Crashlytics Shutdown Hook for ", str)));
        return executorServiceUnconfigurableExecutorService;
    }

    /* JADX INFO: renamed from: e0 */
    public static synchronized C4999f0 m10985e0(Context context) {
        if (f24725a == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            f24725a = new C4999f0(new C5001f2(context));
        }
        return f24725a;
    }

    /* JADX INFO: renamed from: f */
    public static <ResultT> ResultT m10986f(AbstractC5141e<ResultT> abstractC5141e) throws ExecutionException {
        if (abstractC5141e.mo11568f()) {
            return abstractC5141e.mo11566d();
        }
        throw new ExecutionException(abstractC5141e.mo11565c());
    }

    /* JADX INFO: renamed from: f0 */
    public static void m10987f0(AbstractC5118u abstractC5118u, InputStream inputStream, OutputStream outputStream, long j2) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int i = dataInputStream.readInt();
        if (i != -771763713) {
            String strValueOf = String.valueOf(String.format("%x", Integer.valueOf(i)));
            throw new C5117t(strValueOf.length() != 0 ? "Unexpected magic=".concat(strValueOf) : new String("Unexpected magic="));
        }
        int i2 = dataInputStream.read();
        if (i2 != 4) {
            throw new C5117t(outline.m1585g(30, "Unexpected version=", i2));
        }
        long j3 = 0;
        while (true) {
            long j4 = j2 - j3;
            try {
                int unsignedShort = dataInputStream.read();
                if (unsignedShort == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (unsignedShort == 0) {
                    outputStream.flush();
                    return;
                }
                switch (unsignedShort) {
                    case 247:
                        unsignedShort = dataInputStream.readUnsignedShort();
                        m10997k0(bArr, dataInputStream, outputStream, unsignedShort, j4);
                        break;
                    case 248:
                        unsignedShort = dataInputStream.readInt();
                        m10997k0(bArr, dataInputStream, outputStream, unsignedShort, j4);
                        break;
                    case 249:
                        long unsignedShort2 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        m11001m0(bArr, abstractC5118u, outputStream, unsignedShort2, unsignedShort, j4);
                        break;
                        break;
                    case 250:
                        long unsignedShort3 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        m11001m0(bArr, abstractC5118u, outputStream, unsignedShort3, unsignedShort, j4);
                        break;
                    case 251:
                        long unsignedShort4 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readInt();
                        m11001m0(bArr, abstractC5118u, outputStream, unsignedShort4, unsignedShort, j4);
                        break;
                    case 252:
                        long j5 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        m11001m0(bArr, abstractC5118u, outputStream, j5, unsignedShort, j4);
                        break;
                        break;
                    case 253:
                        long j6 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        m11001m0(bArr, abstractC5118u, outputStream, j6, unsignedShort, j4);
                        break;
                    case 254:
                        long j7 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readInt();
                        m11001m0(bArr, abstractC5118u, outputStream, j7, unsignedShort, j4);
                        break;
                    case 255:
                        long j8 = dataInputStream.readLong();
                        unsignedShort = dataInputStream.readInt();
                        m11001m0(bArr, abstractC5118u, outputStream, j8, unsignedShort, j4);
                        break;
                    default:
                        m10997k0(bArr, dataInputStream, outputStream, unsignedShort, j4);
                        break;
                }
                j3 += (long) unsignedShort;
            } catch (Throwable th) {
                outputStream.flush();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m10988g(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static int m10989g0(int i, int i2, float f) {
        return ColorUtils.m16163b(ColorUtils.m16165d(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* JADX INFO: renamed from: h */
    public static void m10990h(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static String m10991h0(@NullableDecl String str, @NullableDecl Object... objArr) {
        int iIndexOf;
        String strValueOf;
        String strValueOf2 = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            try {
                strValueOf = String.valueOf(obj);
            } catch (Exception e) {
                String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e);
                strValueOf = "<" + str2 + " threw " + e.getClass().getName() + ">";
            }
            objArr[i2] = strValueOf;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf2.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf2.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf2, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf2, i3, strValueOf2.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static void m10992i(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static float m10993i0(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: j */
    public static int m10994j(int i, int i2) {
        String strM10991h0;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM10991h0 = m10991h0("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new IllegalArgumentException(outline.m1590l("negative size: ", i2));
            }
            strM10991h0 = m10991h0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM10991h0);
    }

    /* JADX INFO: renamed from: j0 */
    public static int m10995j0(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        if (i >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i3 = 0;
        while (true) {
            int i4 = i + i3;
            if (i4 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int iM10956G = m10956G(fArr, iArr, Integer.MAX_VALUE, bArr);
                int i5 = 0;
                for (int i6 = 0; i6 < 6; i6++) {
                    i5 += bArr[i6];
                }
                if (iArr[0] == iM10956G) {
                    return 0;
                }
                if (i5 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i5 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i5 != 1 || bArr[2] <= 0) {
                    return (i5 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = charSequence.charAt(i4);
            i3++;
            if (m10971V(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m10972W(cCharAt)) {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (cCharAt == ' ' || (cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m10972W(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (cCharAt == ' ' || (cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m10972W(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m10977a0(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m10972W(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (cCharAt >= ' ' && cCharAt <= '^') {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m10972W(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i3 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m10956G(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int i7 = 0;
                for (int i8 = 0; i8 < 6; i8++) {
                    i7 += bArr2[i8];
                }
                if (iArr2[0] < iArr2[5] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (i7 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (i7 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (i7 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        for (int i9 = i + i3 + 1; i9 < charSequence.length(); i9++) {
                            char cCharAt2 = charSequence.charAt(i9);
                            if (m10983d0(cCharAt2)) {
                                return 3;
                            }
                            if (!m10977a0(cCharAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: k */
    public static Object m10996k(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(outline.m1590l("at index ", i));
    }

    /* JADX INFO: renamed from: k0 */
    public static void m10997k0(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j2) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (i > j2) {
            throw new IOException("Output length overrun");
        }
        while (i > 0) {
            try {
                int iMin = Math.min(i, 16384);
                dataInputStream.readFully(bArr, 0, iMin);
                outputStream.write(bArr, 0, iMin);
                i -= iMin;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m10998l(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(outline.m1598t("null key in entry: null=", obj2));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* JADX INFO: renamed from: l0 */
    public static PorterDuff.Mode m10999l0(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: m */
    public static int m11000m(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m11001m0(byte[] bArr, AbstractC5118u abstractC5118u, OutputStream outputStream, long j2, int i, long j3) throws IOException {
        InputStream inputStreamMo11507c;
        int i2 = i;
        if (i2 < 0) {
            throw new IOException("copyLength negative");
        }
        if (j2 < 0) {
            throw new IOException("inputOffset negative");
        }
        long j4 = i2;
        if (j4 > j3) {
            throw new IOException("Output length overrun");
        }
        try {
            C5119v c5119v = new C5119v(abstractC5118u, j2, j4);
            synchronized (c5119v) {
                inputStreamMo11507c = c5119v.mo11507c(0L, c5119v.mo11506a());
            }
            while (i2 > 0) {
                try {
                    int iMin = Math.min(i2, 16384);
                    int i3 = 0;
                    while (i3 < iMin) {
                        int i4 = inputStreamMo11507c.read(bArr, i3, iMin - i3);
                        if (i4 == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i3 += i4;
                        throw new IOException("patch underrun", e);
                    }
                    outputStream.write(bArr, 0, iMin);
                    i2 -= iMin;
                } catch (Throwable th) {
                    try {
                        inputStreamMo11507c.close();
                        throw th;
                    } catch (Throwable th2) {
                        C5084c0.f26038a.mo11527a(th, th2);
                        throw th;
                    }
                }
            }
            inputStreamMo11507c.close();
        } catch (EOFException e) {
            throw new IOException("patch underrun", e);
        }
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    public static int m11002n(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m10982d(i, i2, "index"));
        }
        return i;
    }

    /* JADX INFO: renamed from: n0 */
    public static void m11003n0(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) background;
            MaterialShapeDrawable.b bVar = materialShapeDrawable.f25574h;
            if (bVar.f25608o != f) {
                bVar.f25608o = f;
                materialShapeDrawable.m11365A();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m11004o(int i, int i2, int i3) {
        String strM10982d;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM10982d = m10982d(i, i3, "start index");
            } else {
                strM10982d = (i2 < 0 || i2 > i3) ? m10982d(i2, i3, "end index") : m10991h0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM10982d);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m11005o0(View view, MaterialShapeDrawable materialShapeDrawable) {
        ElevationOverlayProvider elevationOverlayProvider = materialShapeDrawable.f25574h.f25595b;
        if (elevationOverlayProvider != null && elevationOverlayProvider.f25322a) {
            float elevation = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                elevation += ((View) parent).getElevation();
            }
            MaterialShapeDrawable.b bVar = materialShapeDrawable.f25574h;
            if (bVar.f25607n != elevation) {
                bVar.f25607n = elevation;
                materialShapeDrawable.m11365A();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m11006p(boolean z) {
        if (!z) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static int m11007p0(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: q */
    public static int m11008q(long j2) {
        int i = (int) j2;
        if (((long) i) == j2) {
            return i;
        }
        throw new IllegalArgumentException(m10991h0("Out of range: %s", Long.valueOf(j2)));
    }

    /* JADX INFO: renamed from: q0 */
    public static int m11009q0(@NullableDecl Object obj) {
        return m11007p0(obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: renamed from: r */
    public static Component3<?> m11010r(String str, String str2) {
        final AutoValue_LibraryVersion autoValue_LibraryVersion = new AutoValue_LibraryVersion(str, str2);
        Component3.b bVarM11686a = Component3.m11686a(LibraryVersion.class);
        bVarM11686a.f26364d = 1;
        bVarM11686a.m11691c(new ComponentFactory(autoValue_LibraryVersion) { // from class: c.n.d.k.c

            /* JADX INFO: renamed from: a */
            public final Object f26353a;

            {
                this.f26353a = autoValue_LibraryVersion;
            }

            @Override // p007c.p190n.p385d.p390k.ComponentFactory
            /* JADX INFO: renamed from: a */
            public Object mo11679a(ComponentContainer componentContainer) {
                return this.f26353a;
            }
        });
        return bVarM11686a.m11690b();
    }

    /* JADX INFO: renamed from: r0 */
    public static int[] m11011r0(Collection<? extends Number> collection) {
        if (collection instanceof Ints) {
            Ints ints = (Ints) collection;
            return Arrays.copyOfRange(ints.f26294f, ints.f26295g, ints.f26296h);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            Objects.requireNonNull(obj);
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static Animator m11012s(CircularRevealWidget circularRevealWidget, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(circularRevealWidget, (Property<CircularRevealWidget, V>) CircularRevealWidget.c.f25194a, (TypeEvaluator) CircularRevealWidget.b.f25192a, (Object[]) new CircularRevealWidget.e[]{new CircularRevealWidget.e(f, f2, f3)});
        CircularRevealWidget.e revealInfo = circularRevealWidget.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) circularRevealWidget, (int) f, (int) f2, revealInfo.f25198c, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    /* JADX INFO: renamed from: s0 */
    public static PorterDuffColorFilter m11013s0(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    /* JADX INFO: renamed from: t */
    public static CornerTreatment m11014t(int i) {
        if (i != 0) {
            return i != 1 ? new RoundedCornerTreatment() : new CutCornerTreatment();
        }
        return new RoundedCornerTreatment();
    }

    /* JADX INFO: renamed from: u */
    public static long m11015u(byte[] bArr, int i) {
        return ((long) ((m10950A(bArr, i + 2) << 16) | m10950A(bArr, i))) & 4294967295L;
    }

    /* JADX INFO: renamed from: v */
    public static void m11016v(List<Component3<?>> list) {
        Set<CycleDetector2> set;
        HashMap map = new HashMap(list.size());
        Iterator<Component3<?>> it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (CycleDetector2 cycleDetector2 : (Set) it2.next()) {
                        for (Dependency dependency : cycleDetector2.f26394a.f26356b) {
                            if ((dependency.f26401c == 0) && (set = (Set) map.get(new CycleDetector3(dependency.f26399a, dependency.m11700a(), null))) != null) {
                                for (CycleDetector2 cycleDetector3 : set) {
                                    cycleDetector2.f26395b.add(cycleDetector3);
                                    cycleDetector3.f26396c.add(cycleDetector2);
                                }
                            }
                        }
                    }
                }
                HashSet<CycleDetector2> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (CycleDetector2 cycleDetector4 : hashSet) {
                    if (cycleDetector4.m11699a()) {
                        hashSet2.add(cycleDetector4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    CycleDetector2 cycleDetector5 = (CycleDetector2) hashSet2.iterator().next();
                    hashSet2.remove(cycleDetector5);
                    i++;
                    for (CycleDetector2 cycleDetector6 : cycleDetector5.f26395b) {
                        cycleDetector6.f26396c.remove(cycleDetector5);
                        if (cycleDetector6.m11699a()) {
                            hashSet2.add(cycleDetector6);
                        }
                    }
                }
                if (i == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (CycleDetector2 cycleDetector7 : hashSet) {
                    if (!cycleDetector7.m11699a() && !cycleDetector7.f26395b.isEmpty()) {
                        arrayList.add(cycleDetector7.f26394a);
                    }
                }
                throw new DependencyCycleException(arrayList);
            }
            Component3<?> next = it.next();
            CycleDetector2 cycleDetector8 = new CycleDetector2(next);
            for (Class<? super Object> cls : next.f26355a) {
                boolean z = !next.m11688b();
                CycleDetector3 cycleDetector9 = new CycleDetector3(cls, z, null);
                if (!map.containsKey(cycleDetector9)) {
                    map.put(cycleDetector9, new HashSet());
                }
                Set set2 = (Set) map.get(cycleDetector9);
                if (!set2.isEmpty() && !z) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(cycleDetector8);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static float m11017w(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    /* JADX INFO: renamed from: x */
    public static float m11018x(float f, float f2, float f3, float f4, float f5, float f6) {
        float fM11017w = m11017w(f, f2, f3, f4);
        float fM11017w2 = m11017w(f, f2, f5, f4);
        float fM11017w3 = m11017w(f, f2, f5, f6);
        float fM11017w4 = m11017w(f, f2, f3, f6);
        if (fM11017w > fM11017w2 && fM11017w > fM11017w3 && fM11017w > fM11017w4) {
            return fM11017w;
        }
        if (fM11017w2 <= fM11017w3 || fM11017w2 <= fM11017w4) {
            return fM11017w3 > fM11017w4 ? fM11017w3 : fM11017w4;
        }
        return fM11017w2;
    }

    /* JADX INFO: renamed from: y */
    public static void m11019y(View view, ViewUtils3 viewUtils3) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        ViewCompat.c.m16336d(view, new a(viewUtils3, new ViewUtils4(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new ViewUtils2());
        }
    }

    /* JADX INFO: renamed from: z */
    public static float m11020z(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }
}
