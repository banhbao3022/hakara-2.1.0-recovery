package p636z0.p641a0;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p636z0.p660c0.p661a.SupportSQLiteOpenHelper;

/* JADX INFO: renamed from: z0.a0.h, reason: use source file name */
/* JADX INFO: compiled from: DatabaseConfiguration.java */
/* JADX INFO: loaded from: classes.dex */
public class DatabaseConfiguration {

    /* JADX INFO: renamed from: a */
    public final SupportSQLiteOpenHelper.c f34242a;

    /* JADX INFO: renamed from: b */
    public final Context f34243b;

    /* JADX INFO: renamed from: c */
    public final String f34244c;

    /* JADX INFO: renamed from: d */
    public final RoomDatabase.d f34245d;

    /* JADX INFO: renamed from: e */
    public final List<RoomDatabase.b> f34246e;

    /* JADX INFO: renamed from: f */
    public final RoomDatabase.e f34247f;

    /* JADX INFO: renamed from: g */
    public final List<Object> f34248g;

    /* JADX INFO: renamed from: h */
    public final boolean f34249h;

    /* JADX INFO: renamed from: i */
    public final RoomDatabase.c f34250i;

    /* JADX INFO: renamed from: j */
    public final Executor f34251j;

    /* JADX INFO: renamed from: k */
    public final Executor f34252k;

    /* JADX INFO: renamed from: l */
    public final boolean f34253l;

    /* JADX INFO: renamed from: m */
    public final boolean f34254m;

    /* JADX INFO: renamed from: n */
    public final boolean f34255n;

    /* JADX INFO: renamed from: o */
    public final Set<Integer> f34256o;

    @Deprecated
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.c cVar, RoomDatabase.d dVar, List<RoomDatabase.b> list, boolean z, RoomDatabase.c cVar2, Executor executor, boolean z2, Set<Integer> set) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor, false, z2, false, set, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public boolean m14512a(int i, int i2) {
        Set<Integer> set;
        return !((i > i2) && this.f34255n) && this.f34254m && ((set = this.f34256o) == null || !set.contains(Integer.valueOf(i)));
    }

    @Deprecated
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.c cVar, RoomDatabase.d dVar, List<RoomDatabase.b> list, boolean z, RoomDatabase.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor2, z2, z3, z4, set, null, null, null, null, null);
    }

    @Deprecated
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.c cVar, RoomDatabase.d dVar, List<RoomDatabase.b> list, boolean z, RoomDatabase.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor2, z2, z3, z4, set, str2, file, null, null, null);
    }

    @Deprecated
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.c cVar, RoomDatabase.d dVar, List<RoomDatabase.b> list, boolean z, RoomDatabase.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor2, z2, z3, z4, set, str2, file, callable, null, null);
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.c cVar, RoomDatabase.d dVar, List<RoomDatabase.b> list, boolean z, RoomDatabase.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.e eVar) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor2, z2, z3, z4, set, str2, file, callable, eVar, null);
    }

    @SuppressLint({"LambdaLast"})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.c cVar, RoomDatabase.d dVar, List<RoomDatabase.b> list, boolean z, RoomDatabase.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.e eVar, List<Object> list2) {
        this.f34242a = cVar;
        this.f34243b = context;
        this.f34244c = str;
        this.f34245d = dVar;
        this.f34246e = list;
        this.f34249h = z;
        this.f34250i = cVar2;
        this.f34251j = executor;
        this.f34252k = executor2;
        this.f34253l = z2;
        this.f34254m = z3;
        this.f34255n = z4;
        this.f34256o = set;
        this.f34247f = eVar;
        this.f34248g = list2 == null ? Collections.emptyList() : list2;
    }
}
