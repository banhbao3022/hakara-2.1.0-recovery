package p636z0.p725k.p727d.p728c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.C8162a;
import p636z0.p725k.p729e.TypefaceCompat;

/* JADX INFO: renamed from: z0.k.d.c.h, reason: use source file name */
/* JADX INFO: compiled from: ResourcesCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class ResourcesCompat {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f37835a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap<b, SparseArray<a>> f37836b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c */
    public static final Object f37837c = new Object();

    /* JADX INFO: renamed from: z0.k.d.c.h$a */
    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final ColorStateList f37838a;

        /* JADX INFO: renamed from: b */
        public final Configuration f37839b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.f37838a = colorStateList;
            this.f37839b = configuration;
        }
    }

    /* JADX INFO: renamed from: z0.k.d.c.h$b */
    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Resources f37840a;

        /* JADX INFO: renamed from: b */
        public final Resources.Theme f37841b;

        public b(Resources resources, Resources.Theme theme) {
            this.f37840a = resources;
            this.f37841b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f37840a.equals(bVar.f37840a) && Objects.equals(this.f37841b, bVar.f37841b);
        }

        public int hashCode() {
            return Objects.hash(this.f37840a, this.f37841b);
        }
    }

    /* JADX INFO: renamed from: z0.k.d.c.h$c */
    /* JADX INFO: compiled from: ResourcesCompat.java */
    public static abstract class c {

        /* JADX INFO: renamed from: z0.k.d.c.h$c$a */
        /* JADX INFO: compiled from: ResourcesCompat.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Typeface f37842f;

            public a(Typeface typeface) {
                this.f37842f = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.mo11357e(this.f37842f);
            }
        }

        /* JADX INFO: renamed from: z0.k.d.c.h$c$b */
        /* JADX INFO: compiled from: ResourcesCompat.java */
        public class b implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ int f37844f;

            public b(int i) {
                this.f37844f = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.mo11356d(this.f37844f);
            }
        }

        /* JADX INFO: renamed from: c */
        public static Handler m16159c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* JADX INFO: renamed from: a */
        public final void m16160a(int i, Handler handler) {
            m16159c(handler).post(new b(i));
        }

        /* JADX INFO: renamed from: b */
        public final void m16161b(Typeface typeface, Handler handler) {
            m16159c(handler).post(new a(typeface));
        }

        /* JADX INFO: renamed from: d */
        public abstract void mo11356d(int i);

        /* JADX INFO: renamed from: e */
        public abstract void mo11357e(Typeface typeface);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX INFO: renamed from: a */
    public static Typeface m16158a(Context context, int i, TypedValue typedValue, int i2, c cVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            StringBuilder sbM1556G = outline.m1556G("Resource \"");
            sbM1556G.append(resources.getResourceName(i));
            sbM1556G.append("\" (");
            sbM1556G.append(Integer.toHexString(i));
            sbM1556G.append(") is not a Font: ");
            sbM1556G.append(typedValue);
            throw new Resources.NotFoundException(sbM1556G.toString());
        }
        String string = charSequence.toString();
        Typeface typefaceM16171a = null;
        if (string.startsWith("res/")) {
            Typeface typefaceM15597a = TypefaceCompat.f37858b.m15597a(TypefaceCompat.m16173c(resources, i, i2));
            if (typefaceM15597a != null) {
                if (cVar != null) {
                    cVar.m16161b(typefaceM15597a, handler);
                }
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        FontResourcesParserCompat fontResourcesParserCompatM16039J = C8162a.m16039J(resources.getXml(i), resources);
                        if (fontResourcesParserCompatM16039J == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (cVar != null) {
                                cVar.m16160a(-3, handler);
                            }
                        } else {
                            typefaceM16171a = TypefaceCompat.m16171a(context, fontResourcesParserCompatM16039J, resources, i, i2, cVar, handler, z);
                        }
                    } else {
                        typefaceM15597a = TypefaceCompat.m16172b(context, resources, i, string, i2);
                        if (cVar != null) {
                            if (typefaceM15597a != null) {
                                cVar.m16161b(typefaceM15597a, handler);
                            } else {
                                cVar.m16160a(-3, handler);
                            }
                        }
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource " + string, e);
                    if (cVar != null) {
                        cVar.m16160a(-3, handler);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource " + string, e2);
                    if (cVar != null) {
                        cVar.m16160a(-3, handler);
                    }
                }
            }
            typefaceM16171a = typefaceM15597a;
        } else if (cVar != null) {
            cVar.m16160a(-3, handler);
        }
        if (typefaceM16171a != null || cVar != null || z2) {
            return typefaceM16171a;
        }
        StringBuilder sbM1556G2 = outline.m1556G("Font resource ID #0x");
        sbM1556G2.append(Integer.toHexString(i));
        sbM1556G2.append(" could not be retrieved.");
        throw new Resources.NotFoundException(sbM1556G2.toString());
    }
}
