package p007c.p190n.p194b.p367f.p368a.p370b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p367f.p368a.p372c.C5074a;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;
import p007c.p190n.p194b.p367f.p368a.p373d.C5113r;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5086d0;
import p007c.p190n.p194b.p367f.p368a.p377h.AbstractC5141e;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;
import p007c.p190n.p194b.p367f.p368a.p377h.C5155s;

/* JADX INFO: renamed from: c.n.b.f.a.b.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4996e1 implements InterfaceC5037o2 {

    /* JADX INFO: renamed from: a */
    public static final C5089f f25743a = new C5089f("FakeAssetPackService");

    /* JADX INFO: renamed from: b */
    public final String f25744b;

    /* JADX INFO: renamed from: c */
    public final C5046r f25745c;

    /* JADX INFO: renamed from: d */
    public final Context f25746d;

    /* JADX INFO: renamed from: e */
    public final C5040p1 f25747e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5086d0<Executor> f25748f;

    /* JADX INFO: renamed from: g */
    public final Handler f25749g = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    public C4996e1(File file, C5046r c5046r, C5027m0 c5027m0, Context context, C5040p1 c5040p1, InterfaceC5086d0<Executor> interfaceC5086d0) {
        this.f25744b = file.getAbsolutePath();
        this.f25745c = c5046r;
        this.f25746d = context;
        this.f25747e = c5040p1;
        this.f25748f = interfaceC5086d0;
    }

    /* JADX INFO: renamed from: h */
    public static long m11432h(int i, long j2) {
        if (i == 2) {
            return j2 / 2;
        }
        if (i == 3 || i == 4) {
            return j2;
        }
        return 0L;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: a */
    public final void mo11433a() {
        f25743a.m11533b(4, "keepAlive", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: b */
    public final void mo11434b(int i) {
        f25743a.m11533b(4, "notifySessionFailed", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: c */
    public final void mo11435c(int i, String str, String str2, int i2) {
        f25743a.m11533b(4, "notifyChunkTransferred", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: d */
    public final void mo11436d(final int i, final String str) {
        f25743a.m11533b(4, "notifyModuleCompleted", new Object[0]);
        this.f25748f.m11529a().execute(new Runnable(this, i, str) { // from class: c.n.b.f.a.b.b1

            /* JADX INFO: renamed from: f */
            public final C4996e1 f25705f;

            /* JADX INFO: renamed from: g */
            public final int f25706g;

            /* JADX INFO: renamed from: h */
            public final String f25707h;

            {
                this.f25705f = this;
                this.f25706g = i;
                this.f25707h = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C4996e1 c4996e1 = this.f25705f;
                int i2 = this.f25706g;
                String str2 = this.f25707h;
                Objects.requireNonNull(c4996e1);
                try {
                    c4996e1.m11441j(i2, str2, 4);
                } catch (C5074a e) {
                    C4996e1.f25743a.m11533b(5, "notifyModuleCompleted failed", new Object[]{e});
                }
            }
        });
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: e */
    public final AbstractC5141e<ParcelFileDescriptor> mo11437e(int i, String str, String str2, int i2) {
        f25743a.m11533b(4, "getChunkFileDescriptor(session=%d, %s, %s, %d)", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)});
        C5151o c5151o = new C5151o();
        try {
            for (File file : m11440i(str)) {
                if (C5113r.m11551a(file).equals(str2)) {
                    c5151o.f26116a.m11574g((ResultT) ParcelFileDescriptor.open(file, 268435456));
                    return c5151o.f26116a;
                }
            }
            throw new C5074a(String.format("Local testing slice for '%s' not found.", str2));
        } catch (C5074a e) {
            f25743a.m11533b(5, "getChunkFileDescriptor failed", new Object[]{e});
            c5151o.f26116a.m11575h(e);
        } catch (FileNotFoundException e2) {
            f25743a.m11533b(5, "getChunkFileDescriptor failed", new Object[]{e2});
            c5151o.f26116a.m11575h(new C5074a("Asset Slice file not found.", e2));
        }
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: f */
    public final AbstractC5141e<List<String>> mo11438f(Map<String, Long> map) {
        f25743a.m11533b(4, "syncPacks()", new Object[0]);
        ArrayList arrayList = new ArrayList();
        C5155s c5155s = new C5155s();
        c5155s.m11574g(arrayList);
        return c5155s;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: g */
    public final void mo11439g(List<String> list) {
        f25743a.m11533b(4, "cancelDownload(%s)", new Object[]{list});
    }

    /* JADX INFO: renamed from: i */
    public final File[] m11440i(final String str) throws C5074a {
        File file = new File(this.f25744b);
        if (!file.isDirectory()) {
            throw new C5074a(String.format("Local testing directory '%s' not found.", file));
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter(str) { // from class: c.n.b.f.a.b.c1

            /* JADX INFO: renamed from: a */
            public final String f25714a;

            {
                this.f25714a = str;
            }

            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(this.f25714a).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (fileArrListFiles == null) {
            throw new C5074a(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        if (fileArrListFiles.length == 0) {
            throw new C5074a(String.format("No APKs available for pack '%s'.", str));
        }
        for (File file2 : fileArrListFiles) {
            if (C5113r.m11551a(file2).equals(str)) {
                return fileArrListFiles;
            }
        }
        throw new C5074a(String.format("No master slice available for pack '%s'.", str));
    }

    /* JADX INFO: renamed from: j */
    public final void m11441j(int i, String str, int i2) throws C5074a {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f25747e.m11467a());
        bundle.putInt("session_id", i);
        File[] fileArrM11440i = m11440i(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long length = 0;
        for (File file : fileArrM11440i) {
            length += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String strM11551a = C5113r.m11551a(file);
            bundle.putParcelableArrayList(C4799a.m10954E("chunk_intents", str, strM11551a), arrayList2);
            try {
                bundle.putString(C4799a.m10954E("uncompressed_hash_sha256", str, strM11551a), C4799a.m10976a(Arrays.asList(file)));
                bundle.putLong(C4799a.m10954E("uncompressed_size", str, strM11551a), file.length());
                arrayList.add(strM11551a);
            } catch (IOException e) {
                throw new C5074a(String.format("Could not digest file: %s.", file), e);
            } catch (NoSuchAlgorithmException e2) {
                throw new C5074a("SHA256 algorithm not supported.", e2);
            }
        }
        bundle.putStringArrayList(C4799a.m10951B("slice_ids", str), arrayList);
        bundle.putLong(C4799a.m10951B("pack_version", str), this.f25747e.m11467a());
        bundle.putInt(C4799a.m10951B("status", str), i2);
        bundle.putInt(C4799a.m10951B("error_code", str), 0);
        bundle.putLong(C4799a.m10951B("bytes_downloaded", str), m11432h(i2, length));
        bundle.putLong(C4799a.m10951B("total_bytes_to_download", str), length);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", m11432h(i2, length));
        bundle.putLong("total_bytes_to_download", length);
        final Intent intentPutExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.f25749g.post(new Runnable(this, intentPutExtra) { // from class: c.n.b.f.a.b.d1

            /* JADX INFO: renamed from: f */
            public final C4996e1 f25726f;

            /* JADX INFO: renamed from: g */
            public final Intent f25727g;

            {
                this.f25726f = this;
                this.f25727g = intentPutExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C4996e1 c4996e1 = this.f25726f;
                c4996e1.f25745c.mo11469a(c4996e1.f25746d, this.f25727g);
            }
        });
    }
}
