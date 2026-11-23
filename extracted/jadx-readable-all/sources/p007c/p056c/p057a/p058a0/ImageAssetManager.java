package p007c.p056c.p057a.p058a0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p007c.p056c.p057a.ImageAssetDelegate;
import p007c.p056c.p057a.LottieImageAsset;
import p007c.p056c.p057a.p066e0.Logger2;

/* JADX INFO: renamed from: c.c.a.a0.b, reason: use source file name */
/* JADX INFO: compiled from: ImageAssetManager.java */
/* JADX INFO: loaded from: classes.dex */
public class ImageAssetManager {

    /* JADX INFO: renamed from: a */
    public static final Object f1961a = new Object();

    /* JADX INFO: renamed from: b */
    public final Context f1962b;

    /* JADX INFO: renamed from: c */
    public String f1963c;

    /* JADX INFO: renamed from: d */
    public ImageAssetDelegate f1964d;

    /* JADX INFO: renamed from: e */
    public final Map<String, LottieImageAsset> f1965e;

    public ImageAssetManager(Drawable.Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map<String, LottieImageAsset> map) {
        this.f1963c = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f1963c;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.f1963c += '/';
            }
        }
        if (callback instanceof View) {
            this.f1962b = ((View) callback).getContext();
            this.f1965e = map;
            this.f1964d = imageAssetDelegate;
        } else {
            Logger2.m1420b("LottieDrawable must be inside of a view for images to work.");
            this.f1965e = new HashMap();
            this.f1962b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m1327a(String str, Bitmap bitmap) {
        synchronized (f1961a) {
            this.f1965e.get(str).f2448e = bitmap;
        }
        return bitmap;
    }
}
