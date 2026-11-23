package p007c.p085g.p086a.p089m.p098v.p101f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;

/* JADX INFO: renamed from: c.g.a.m.v.f.e, reason: use source file name */
/* JADX INFO: compiled from: ResourceDrawableDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class ResourceDrawableDecoder implements ResourceDecoder<Uri, Drawable> {

    /* JADX INFO: renamed from: a */
    public final Context f3607a;

    public ResourceDrawableDecoder(Context context) {
        this.f3607a = context.getApplicationContext();
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public boolean mo1709a(Uri uri, Options options) throws IOException {
        return uri.getScheme().equals("android.resource");
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Resource2<Drawable> mo1710b(Uri uri, int i, int i2, Options options) throws IOException {
        return m1919c(uri);
    }

    /* JADX INFO: renamed from: c */
    public Resource2 m1919c(Uri uri) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (authority.equals(this.f3607a.getPackageName())) {
            contextCreatePackageContext = this.f3607a;
        } else {
            try {
                contextCreatePackageContext = this.f3607a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(this.f3607a.getPackageName())) {
                    throw new IllegalArgumentException(outline.m1596r("Failed to obtain context or unrecognized Uri format for: ", uri), e);
                }
                contextCreatePackageContext = this.f3607a;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(outline.m1596r("Failed to find resource id for: ", uri));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(outline.m1596r("Unrecognized Uri format: ", uri));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(outline.m1596r("Unrecognized Uri format: ", uri), e2);
            }
        }
        Drawable drawableM1918a = DrawableDecoderCompat.m1918a(this.f3607a, contextCreatePackageContext, identifier, null);
        if (drawableM1918a != null) {
            return new NonOwnedDrawableResource(drawableM1918a);
        }
        return null;
    }
}
