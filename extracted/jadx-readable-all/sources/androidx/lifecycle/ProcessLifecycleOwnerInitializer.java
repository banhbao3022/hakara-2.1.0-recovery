package androidx.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleDispatcher;
import p636z0.p759s.ProcessLifecycleOwner;
import p636z0.p759s.ProcessLifecycleOwner2;

/* JADX INFO: loaded from: classes.dex */
public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (!LifecycleDispatcher.f38703a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new LifecycleDispatcher.a());
        }
        Context context2 = getContext();
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f38717f;
        Objects.requireNonNull(processLifecycleOwner);
        processLifecycleOwner.f38722k = new Handler();
        processLifecycleOwner.f38723l.m16733f(Lifecycle3.a.ON_CREATE);
        ((Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new ProcessLifecycleOwner2(processLifecycleOwner));
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
