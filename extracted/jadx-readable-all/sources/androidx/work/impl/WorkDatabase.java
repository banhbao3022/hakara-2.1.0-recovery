package androidx.work.impl;

import java.util.concurrent.TimeUnit;
import p636z0.p641a0.RoomDatabase;
import p636z0.p709j0.p710y.p719s.DependencyDao;
import p636z0.p709j0.p710y.p719s.PreferenceDao;
import p636z0.p709j0.p710y.p719s.SystemIdInfoDao;
import p636z0.p709j0.p710y.p719s.WorkNameDao;
import p636z0.p709j0.p710y.p719s.WorkProgressDao;
import p636z0.p709j0.p710y.p719s.WorkSpecDao;
import p636z0.p709j0.p710y.p719s.WorkTagDao;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: n */
    public static final long f1373n = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f1374o = 0;

    /* JADX INFO: renamed from: p */
    public abstract DependencyDao mo941p();

    /* JADX INFO: renamed from: q */
    public abstract PreferenceDao mo942q();

    /* JADX INFO: renamed from: r */
    public abstract SystemIdInfoDao mo943r();

    /* JADX INFO: renamed from: s */
    public abstract WorkNameDao mo944s();

    /* JADX INFO: renamed from: t */
    public abstract WorkProgressDao mo945t();

    /* JADX INFO: renamed from: u */
    public abstract WorkSpecDao mo946u();

    /* JADX INFO: renamed from: v */
    public abstract WorkTagDao mo947v();
}
