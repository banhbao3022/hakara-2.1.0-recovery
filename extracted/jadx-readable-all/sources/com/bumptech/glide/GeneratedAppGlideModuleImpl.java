package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import mtp.media.karaoke.utils.MainGlideModule;
import p007c.p085g.p086a.GeneratedRequestManagerFactory;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.GlideBuilder;
import p007c.p085g.p086a.Registry;
import p007c.p085g.p086a.p105n.RequestManagerRetriever;

/* JADX INFO: loaded from: classes.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: a */
    public final MainGlideModule f28147a = new MainGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: mtp.media.karaoke.utils.MainGlideModule");
        }
    }

    @Override // p007c.p085g.p086a.p106o.AppGlideModule, p007c.p085g.p086a.p106o.AppliesOptions
    /* JADX INFO: renamed from: a */
    public void mo1960a(Context context, GlideBuilder glideBuilder) {
        this.f28147a.mo1960a(context, glideBuilder);
    }

    @Override // p007c.p085g.p086a.p106o.LibraryGlideModule, p007c.p085g.p086a.p106o.RegistersComponents
    /* JADX INFO: renamed from: b */
    public void mo1962b(Context context, Glide glide, Registry registry) {
        Objects.requireNonNull(this.f28147a);
    }

    @Override // p007c.p085g.p086a.p106o.AppGlideModule
    /* JADX INFO: renamed from: c */
    public boolean mo1961c() {
        Objects.requireNonNull(this.f28147a);
        return true;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* JADX INFO: renamed from: d */
    public Set<Class<?>> mo12563d() {
        return Collections.emptySet();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* JADX INFO: renamed from: e */
    public RequestManagerRetriever.b mo12564e() {
        return new GeneratedRequestManagerFactory();
    }
}
