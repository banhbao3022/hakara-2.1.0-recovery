package p007c.p165l.p178k0;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookContentProvider;
import com.facebook.stetho.common.Utf8Charset;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;

/* JADX INFO: renamed from: c.l.k0.y, reason: use source file name */
/* JADX INFO: compiled from: NativeAppCallAttachmentStore.java */
/* JADX INFO: loaded from: classes.dex */
public final class NativeAppCallAttachmentStore {

    /* JADX INFO: renamed from: a */
    public static final String f5048a = "c.l.k0.y";

    /* JADX INFO: renamed from: b */
    public static File f5049b;

    /* JADX INFO: renamed from: c.l.k0.y$b */
    /* JADX INFO: compiled from: NativeAppCallAttachmentStore.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final UUID f5050a;

        /* JADX INFO: renamed from: b */
        public final String f5051b;

        /* JADX INFO: renamed from: c */
        public final String f5052c;

        /* JADX INFO: renamed from: d */
        public Bitmap f5053d;

        /* JADX INFO: renamed from: e */
        public Uri f5054e;

        /* JADX INFO: renamed from: f */
        public boolean f5055f;

        /* JADX INFO: renamed from: g */
        public boolean f5056g;

        public b(UUID uuid, Bitmap bitmap, Uri uri, a aVar) {
            String string;
            this.f5050a = uuid;
            this.f5053d = bitmap;
            this.f5054e = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if ("content".equalsIgnoreCase(scheme)) {
                    this.f5055f = true;
                    this.f5056g = (uri.getAuthority() == null || uri.getAuthority().startsWith("media")) ? false : true;
                } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                    this.f5056g = true;
                } else if (!Utility.m2428A(uri)) {
                    throw new FacebookException(outline.m1599u("Unsupported scheme for media Uri : ", scheme));
                }
            } else {
                if (bitmap == null) {
                    throw new FacebookException("Cannot share media without a bitmap or Uri set");
                }
                this.f5056g = true;
            }
            String string2 = !this.f5056g ? null : UUID.randomUUID().toString();
            this.f5052c = string2;
            if (this.f5056g) {
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                Validate.m2479h();
                String str = FacebookSdk.f5354c;
                String str2 = FacebookContentProvider.f28293f;
                string = String.format("%s%s/%s/%s", "content://com.facebook.app.FacebookContentProvider", str, uuid.toString(), string2);
            } else {
                string = this.f5054e.toString();
            }
            this.f5051b = string;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2533a(Collection<b> collection) {
        InputStream fileInputStream;
        if (collection == null || collection.size() == 0) {
            return;
        }
        if (f5049b == null) {
            Utility.m2448g(m2535c());
        }
        m2535c().mkdirs();
        ArrayList arrayList = new ArrayList();
        try {
            for (b bVar : collection) {
                if (bVar.f5056g) {
                    File fileM2534b = m2534b(bVar.f5050a, bVar.f5052c, true);
                    arrayList.add(fileM2534b);
                    Bitmap bitmap = bVar.f5053d;
                    if (bitmap != null) {
                        FileOutputStream fileOutputStream = new FileOutputStream(fileM2534b);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                            throw th;
                        }
                    } else {
                        Uri uri = bVar.f5054e;
                        if (uri != null) {
                            boolean z = bVar.f5055f;
                            FileOutputStream fileOutputStream2 = new FileOutputStream(fileM2534b);
                            if (z) {
                                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                                Validate.m2479h();
                                fileInputStream = FacebookSdk.f5360i.getContentResolver().openInputStream(uri);
                            } else {
                                try {
                                    fileInputStream = new FileInputStream(uri.getPath());
                                } catch (Throwable th2) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException unused3) {
                                    }
                                    throw th2;
                                }
                            }
                            Utility.m2447f(fileInputStream, fileOutputStream2);
                            fileOutputStream2.close();
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (IOException e) {
            Log.e(f5048a, "Got unexpected exception:" + e);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((File) it.next()).delete();
                } catch (Exception unused4) {
                }
            }
            throw new FacebookException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static File m2534b(UUID uuid, String str, boolean z) throws IOException {
        File fileM2536d = m2536d(uuid, z);
        if (fileM2536d == null) {
            return null;
        }
        try {
            return new File(fileM2536d, URLEncoder.encode(str, Utf8Charset.NAME));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized File m2535c() {
        if (f5049b == null) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            f5049b = new File(FacebookSdk.f5360i.getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
        }
        return f5049b;
    }

    /* JADX INFO: renamed from: d */
    public static File m2536d(UUID uuid, boolean z) {
        if (f5049b == null) {
            return null;
        }
        File file = new File(f5049b, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
