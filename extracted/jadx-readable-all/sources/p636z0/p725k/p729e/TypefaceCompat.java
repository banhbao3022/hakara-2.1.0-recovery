package p636z0.p725k.p729e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p636z0.p691g.LruCache2;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat2;
import p636z0.p725k.p727d.p728c.FontResourcesParserCompat4;
import p636z0.p725k.p727d.p728c.ResourcesCompat;
import p636z0.p725k.p736i.CallbackWithHandler;
import p636z0.p725k.p736i.CallbackWithHandler2;
import p636z0.p725k.p736i.CallbackWithHandler3;
import p636z0.p725k.p736i.FontRequest;
import p636z0.p725k.p736i.FontRequestWorker;
import p636z0.p725k.p736i.FontRequestWorker2;
import p636z0.p725k.p736i.FontRequestWorker3;
import p636z0.p725k.p736i.FontRequestWorker4;
import p636z0.p725k.p736i.FontRequestWorker5;
import p636z0.p725k.p736i.FontsContractCompat3;
import p636z0.p725k.p736i.RequestExecutor2;
import p636z0.p725k.p738k.Consumer2;

/* JADX INFO: renamed from: z0.k.e.d, reason: use source file name */
/* JADX INFO: compiled from: TypefaceCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public class TypefaceCompat {

    /* JADX INFO: renamed from: a */
    public static final TypefaceCompatBaseImpl2 f37857a;

    /* JADX INFO: renamed from: b */
    public static final LruCache2<String, Typeface> f37858b;

    /* JADX INFO: renamed from: z0.k.e.d$a */
    /* JADX INFO: compiled from: TypefaceCompat.java */
    public static class a extends FontsContractCompat3 {

        /* JADX INFO: renamed from: a */
        public ResourcesCompat.c f37859a;

        public a(ResourcesCompat.c cVar) {
            this.f37859a = cVar;
        }

        @Override // p636z0.p725k.p736i.FontsContractCompat3
        /* JADX INFO: renamed from: a */
        public void mo16174a(int i) {
            ResourcesCompat.c cVar = this.f37859a;
            if (cVar != null) {
                cVar.mo11356d(i);
            }
        }

        @Override // p636z0.p725k.p736i.FontsContractCompat3
        /* JADX INFO: renamed from: b */
        public void mo16175b(Typeface typeface) {
            ResourcesCompat.c cVar = this.f37859a;
            if (cVar != null) {
                cVar.mo11357e(typeface);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f37857a = new TypefaceCompatApi29Impl();
        } else if (i >= 28) {
            f37857a = new TypefaceCompatApi28Impl();
        } else if (i >= 26) {
            f37857a = new TypefaceCompatApi26Impl();
        } else if (i < 24) {
            f37857a = new TypefaceCompatApi21Impl();
        } else {
            Method method = TypefaceCompatApi24Impl.f37867d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f37857a = new TypefaceCompatApi24Impl();
            } else {
                f37857a = new TypefaceCompatApi21Impl();
            }
        }
        f37858b = new LruCache2<>(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX INFO: renamed from: a */
    public static Typeface m16171a(Context context, FontResourcesParserCompat fontResourcesParserCompat, Resources resources, int i, int i2, ResourcesCompat.c cVar, Handler handler, boolean z) {
        Typeface typefaceMo16178a;
        Typeface typefaceCreate;
        if (fontResourcesParserCompat instanceof FontResourcesParserCompat4) {
            FontResourcesParserCompat4 fontResourcesParserCompat4 = (FontResourcesParserCompat4) fontResourcesParserCompat;
            String str = fontResourcesParserCompat4.f37832d;
            typefaceMo16178a = null;
            boolean z2 = false;
            if (str == null || str.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (cVar != null) {
                    cVar.m16161b(typefaceCreate, handler);
                }
                return typefaceCreate;
            }
            if (!z ? cVar == null : fontResourcesParserCompat4.f37831c == 0) {
                z2 = true;
            }
            int i3 = z ? fontResourcesParserCompat4.f37830b : -1;
            Handler handlerM16159c = ResourcesCompat.c.m16159c(handler);
            a aVar = new a(cVar);
            FontRequest fontRequest = fontResourcesParserCompat4.f37829a;
            CallbackWithHandler3 callbackWithHandler3 = new CallbackWithHandler3(aVar, handlerM16159c);
            if (z2) {
                LruCache2<String, Typeface> lruCache2 = FontRequestWorker5.f37918a;
                String str2 = fontRequest.f37907f + "-" + i2;
                Typeface typefaceM15597a = FontRequestWorker5.f37918a.m15597a(str2);
                if (typefaceM15597a != null) {
                    handlerM16159c.post(new CallbackWithHandler(callbackWithHandler3, aVar, typefaceM15597a));
                    typefaceMo16178a = typefaceM15597a;
                } else if (i3 == -1) {
                    FontRequestWorker5.a aVarM16206a = FontRequestWorker5.m16206a(str2, context, fontRequest, i2);
                    callbackWithHandler3.m16204a(aVarM16206a);
                    typefaceMo16178a = aVarM16206a.f37922a;
                } else {
                    try {
                        try {
                            try {
                                FontRequestWorker5.a aVar2 = (FontRequestWorker5.a) FontRequestWorker5.f37919b.submit(new FontRequestWorker(str2, context, fontRequest, i2)).get(i3, TimeUnit.MILLISECONDS);
                                callbackWithHandler3.m16204a(aVar2);
                                typefaceMo16178a = aVar2.f37922a;
                            } catch (ExecutionException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        callbackWithHandler3.f37900b.post(new CallbackWithHandler2(callbackWithHandler3, callbackWithHandler3.f37899a, -3));
                    }
                }
            } else {
                LruCache2<String, Typeface> lruCache3 = FontRequestWorker5.f37918a;
                String str3 = fontRequest.f37907f + "-" + i2;
                Typeface typefaceM15597a2 = FontRequestWorker5.f37918a.m15597a(str3);
                if (typefaceM15597a2 != null) {
                    handlerM16159c.post(new CallbackWithHandler(callbackWithHandler3, aVar, typefaceM15597a2));
                    typefaceMo16178a = typefaceM15597a2;
                } else {
                    FontRequestWorker2 fontRequestWorker2 = new FontRequestWorker2(callbackWithHandler3);
                    synchronized (FontRequestWorker5.f37920c) {
                        SimpleArrayMap<String, ArrayList<Consumer2<FontRequestWorker5.a>>> simpleArrayMap = FontRequestWorker5.f37921d;
                        ArrayList<Consumer2<FontRequestWorker5.a>> orDefault = simpleArrayMap.getOrDefault(str3, null);
                        if (orDefault != null) {
                            orDefault.add(fontRequestWorker2);
                        } else {
                            ArrayList<Consumer2<FontRequestWorker5.a>> arrayList = new ArrayList<>();
                            arrayList.add(fontRequestWorker2);
                            simpleArrayMap.put(str3, arrayList);
                            FontRequestWorker5.f37919b.execute(new RequestExecutor2(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new FontRequestWorker3(str3, context, fontRequest, i2), new FontRequestWorker4(str3)));
                        }
                    }
                }
            }
        } else {
            typefaceMo16178a = f37857a.mo16178a(context, (FontResourcesParserCompat2) fontResourcesParserCompat, resources, i2);
            if (cVar != null) {
                if (typefaceMo16178a != null) {
                    cVar.m16161b(typefaceMo16178a, handler);
                } else {
                    cVar.m16160a(-3, handler);
                }
            }
        }
        if (typefaceMo16178a != null) {
            f37858b.m15598b(m16173c(resources, i, i2), typefaceMo16178a);
        }
        return typefaceMo16178a;
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m16172b(Context context, Resources resources, int i, String str, int i2) {
        Typeface typefaceMo16183d = f37857a.mo16183d(context, resources, i, str, i2);
        if (typefaceMo16183d != null) {
            f37858b.m15598b(m16173c(resources, i, i2), typefaceMo16183d);
        }
        return typefaceMo16183d;
    }

    /* JADX INFO: renamed from: c */
    public static String m16173c(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
