package p555j.p556a.p557a.p606h.p609c.p610a;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.android.billingclient.api.SkuDetails;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p493x.p494b.InterfaceC6164l;
import p555j.p556a.p557a.p606h.p609c.p611b.SkuEntity;
import p636z0.p641a0.CoroutinesRoom4;
import p636z0.p641a0.EntityInsertionAdapter;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.RoomSQLiteQuery;
import p636z0.p641a0.SharedSQLiteStatement;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p660c0.p661a.SupportSQLiteStatement;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: j.a.a.h.c.a.f, reason: use source file name */
/* JADX INFO: compiled from: SkuDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class SkuDao_Impl implements SkuDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f32313a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<SkuEntity> f32314b;

    /* JADX INFO: renamed from: j.a.a.h.c.a.f$a */
    /* JADX INFO: compiled from: SkuDao_Impl.java */
    public class a extends EntityInsertionAdapter<SkuEntity> {
        public a(SkuDao_Impl skuDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "INSERT OR REPLACE INTO `sku` (`sku`,`type`,`price`,`title`,`description`,`originalJson`,`canPurchase`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // p636z0.p641a0.EntityInsertionAdapter
        /* JADX INFO: renamed from: e */
        public void mo14040e(SupportSQLiteStatement supportSQLiteStatement, SkuEntity skuEntity) {
            SkuEntity skuEntity2 = skuEntity;
            String str = skuEntity2.f32351f;
            if (str == null) {
                supportSQLiteStatement.mo14553d0(1);
            } else {
                supportSQLiteStatement.mo14555o(1, str);
            }
            String str2 = skuEntity2.f32352g;
            if (str2 == null) {
                supportSQLiteStatement.mo14553d0(2);
            } else {
                supportSQLiteStatement.mo14555o(2, str2);
            }
            String str3 = skuEntity2.f32353h;
            if (str3 == null) {
                supportSQLiteStatement.mo14553d0(3);
            } else {
                supportSQLiteStatement.mo14555o(3, str3);
            }
            String str4 = skuEntity2.f32354i;
            if (str4 == null) {
                supportSQLiteStatement.mo14553d0(4);
            } else {
                supportSQLiteStatement.mo14555o(4, str4);
            }
            String str5 = skuEntity2.f32355j;
            if (str5 == null) {
                supportSQLiteStatement.mo14553d0(5);
            } else {
                supportSQLiteStatement.mo14555o(5, str5);
            }
            String str6 = skuEntity2.f32356k;
            if (str6 == null) {
                supportSQLiteStatement.mo14553d0(6);
            } else {
                supportSQLiteStatement.mo14555o(6, str6);
            }
            supportSQLiteStatement.mo14549J(7, skuEntity2.f32357l ? 1L : 0L);
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.f$b */
    /* JADX INFO: compiled from: SkuDao_Impl.java */
    public class b extends SharedSQLiteStatement {
        public b(SkuDao_Impl skuDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "UPDATE sku SET canPurchase = ? WHERE sku = ?";
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.f$c */
    /* JADX INFO: compiled from: SkuDao_Impl.java */
    public class c implements Callable<Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SkuEntity f32315a;

        public c(SkuEntity skuEntity) {
            this.f32315a = skuEntity;
        }

        @Override // java.util.concurrent.Callable
        public Unit call() throws Exception {
            SkuDao_Impl.this.f32313a.m14529c();
            try {
                SkuDao_Impl.this.f32314b.m14513f(this.f32315a);
                SkuDao_Impl.this.f32313a.m14537n();
                return Unit.f29502a;
            } finally {
                SkuDao_Impl.this.f32313a.m14530f();
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.f$d */
    /* JADX INFO: compiled from: SkuDao_Impl.java */
    public class d implements InterfaceC6164l<Continuation<? super SkuDetails>, Object> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SkuDetails f32317f;

        public d(SkuDetails skuDetails) {
            this.f32317f = skuDetails;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Object mo3b(Continuation<? super SkuDetails> continuation) {
            return SkuDao.a.m14112y(SkuDao_Impl.this, this.f32317f, continuation);
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.f$e */
    /* JADX INFO: compiled from: SkuDao_Impl.java */
    public class e implements Callable<List<SkuEntity>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f32319a;

        public e(RoomSQLiteQuery roomSQLiteQuery) {
            this.f32319a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public List<SkuEntity> call() throws Exception {
            Cursor cursorM14503b = DBUtil.m14503b(SkuDao_Impl.this.f32313a, this.f32319a, false, null);
            try {
                int iM16940g = C8462c.m16940g(cursorM14503b, "sku");
                int iM16940g2 = C8462c.m16940g(cursorM14503b, "type");
                int iM16940g3 = C8462c.m16940g(cursorM14503b, "price");
                int iM16940g4 = C8462c.m16940g(cursorM14503b, CainMediaMetadataRetriever.METADATA_KEY_TITLE);
                int iM16940g5 = C8462c.m16940g(cursorM14503b, CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION);
                int iM16940g6 = C8462c.m16940g(cursorM14503b, "originalJson");
                int iM16940g7 = C8462c.m16940g(cursorM14503b, "canPurchase");
                ArrayList arrayList = new ArrayList(cursorM14503b.getCount());
                while (cursorM14503b.moveToNext()) {
                    arrayList.add(new SkuEntity(cursorM14503b.isNull(iM16940g) ? null : cursorM14503b.getString(iM16940g), cursorM14503b.isNull(iM16940g2) ? null : cursorM14503b.getString(iM16940g2), cursorM14503b.isNull(iM16940g3) ? null : cursorM14503b.getString(iM16940g3), cursorM14503b.isNull(iM16940g4) ? null : cursorM14503b.getString(iM16940g4), cursorM14503b.isNull(iM16940g5) ? null : cursorM14503b.getString(iM16940g5), cursorM14503b.isNull(iM16940g6) ? null : cursorM14503b.getString(iM16940g6), cursorM14503b.getInt(iM16940g7) != 0));
                }
                return arrayList;
            } finally {
                cursorM14503b.close();
                this.f32319a.m14554h();
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.f$f */
    /* JADX INFO: compiled from: SkuDao_Impl.java */
    public class f implements Callable<SkuEntity> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f32321a;

        public f(RoomSQLiteQuery roomSQLiteQuery) {
            this.f32321a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public SkuEntity call() throws Exception {
            SkuEntity skuEntity = null;
            Cursor cursorM14503b = DBUtil.m14503b(SkuDao_Impl.this.f32313a, this.f32321a, false, null);
            try {
                int iM16940g = C8462c.m16940g(cursorM14503b, "sku");
                int iM16940g2 = C8462c.m16940g(cursorM14503b, "type");
                int iM16940g3 = C8462c.m16940g(cursorM14503b, "price");
                int iM16940g4 = C8462c.m16940g(cursorM14503b, CainMediaMetadataRetriever.METADATA_KEY_TITLE);
                int iM16940g5 = C8462c.m16940g(cursorM14503b, CainMediaMetadataRetriever.METADATA_KEY_DESCRIPTION);
                int iM16940g6 = C8462c.m16940g(cursorM14503b, "originalJson");
                int iM16940g7 = C8462c.m16940g(cursorM14503b, "canPurchase");
                if (cursorM14503b.moveToFirst()) {
                    skuEntity = new SkuEntity(cursorM14503b.isNull(iM16940g) ? null : cursorM14503b.getString(iM16940g), cursorM14503b.isNull(iM16940g2) ? null : cursorM14503b.getString(iM16940g2), cursorM14503b.isNull(iM16940g3) ? null : cursorM14503b.getString(iM16940g3), cursorM14503b.isNull(iM16940g4) ? null : cursorM14503b.getString(iM16940g4), cursorM14503b.isNull(iM16940g5) ? null : cursorM14503b.getString(iM16940g5), cursorM14503b.isNull(iM16940g6) ? null : cursorM14503b.getString(iM16940g6), cursorM14503b.getInt(iM16940g7) != 0);
                }
                return skuEntity;
            } finally {
                cursorM14503b.close();
                this.f32321a.m14554h();
            }
        }
    }

    public SkuDao_Impl(RoomDatabase roomDatabase) {
        this.f32313a = roomDatabase;
        this.f32314b = new a(this, roomDatabase);
        new b(this, roomDatabase);
    }

    @Override // p555j.p556a.p557a.p606h.p609c.p610a.SkuDao
    /* JADX INFO: renamed from: a */
    public Object mo14046a(Continuation<? super List<SkuEntity>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT * FROM sku WHERE type = 'inapp' order by sku ASC", 0);
        return CoroutinesRoom4.m14510a(this.f32313a, false, new CancellationSignal(), new e(roomSQLiteQueryM14548f), continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p609c.p610a.SkuDao
    /* JADX INFO: renamed from: b */
    public Object mo14047b(SkuEntity skuEntity, Continuation<? super Unit> continuation) {
        return CoroutinesRoom4.m14511b(this.f32313a, true, new c(skuEntity), continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p609c.p610a.SkuDao
    /* JADX INFO: renamed from: c */
    public Object mo14048c(SkuDetails skuDetails, Continuation<? super SkuDetails> continuation) {
        return C8462c.m16933B(this.f32313a, new d(skuDetails), continuation);
    }

    /* JADX INFO: renamed from: d */
    public Object m14114d(String str, Continuation<? super SkuEntity> continuation) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT * FROM sku WHERE sku = ?", 1);
        roomSQLiteQueryM14548f.mo14555o(1, str);
        return CoroutinesRoom4.m14510a(this.f32313a, false, new CancellationSignal(), new f(roomSQLiteQueryM14548f), continuation);
    }
}
