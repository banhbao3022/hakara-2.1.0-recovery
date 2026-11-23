package p636z0.p709j0.p710y;

import android.content.Context;
import android.text.TextUtils;
import p636z0.p660c0.p661a.SupportSQLiteOpenHelper;
import p636z0.p660c0.p661a.p662g.FrameworkSQLiteOpenHelperFactory;

/* JADX INFO: renamed from: z0.j0.y.h, reason: use source file name */
/* JADX INFO: compiled from: WorkDatabase.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkDatabase2 implements SupportSQLiteOpenHelper.c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f37325a;

    public WorkDatabase2(Context context) {
        this.f37325a = context;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper.c
    /* JADX INFO: renamed from: a */
    public SupportSQLiteOpenHelper mo15049a(SupportSQLiteOpenHelper.b bVar) {
        Context context = this.f37325a;
        String str = bVar.f35328b;
        SupportSQLiteOpenHelper.a aVar = bVar.f35329c;
        FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
        if (aVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return frameworkSQLiteOpenHelperFactory.mo15049a(new SupportSQLiteOpenHelper.b(context, str, aVar, true));
    }
}
