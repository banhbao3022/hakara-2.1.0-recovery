package p555j.p556a.p557a.p606h.p609c.p610a;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p636z0.p641a0.CoroutinesRoom4;
import p636z0.p641a0.EntityDeletionOrUpdateAdapter;
import p636z0.p641a0.EntityInsertionAdapter;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.RoomSQLiteQuery;
import p636z0.p641a0.SharedSQLiteStatement;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p660c0.p661a.SupportSQLiteStatement;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: j.a.a.h.c.a.d, reason: use source file name */
/* JADX INFO: compiled from: RecordingDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class RecordingDao_Impl implements RecordingDao {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f32283a;

    /* JADX INFO: renamed from: b */
    public final EntityInsertionAdapter<RecordingEntity> f32284b;

    /* JADX INFO: renamed from: c */
    public final EntityInsertionAdapter<RecordingEntity> f32285c;

    /* JADX INFO: renamed from: d */
    public final SharedSQLiteStatement f32286d;

    /* JADX INFO: renamed from: j.a.a.h.c.a.d$a */
    /* JADX INFO: compiled from: RecordingDao_Impl.java */
    public class a implements Callable<Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f32287a;

        public a(long j2) {
            this.f32287a = j2;
        }

        @Override // java.util.concurrent.Callable
        public Unit call() throws Exception {
            SupportSQLiteStatement supportSQLiteStatementM14559a = RecordingDao_Impl.this.f32286d.m14559a();
            supportSQLiteStatementM14559a.mo14549J(1, this.f32287a);
            RecordingDao_Impl.this.f32283a.m14529c();
            try {
                supportSQLiteStatementM14559a.mo15051q();
                RecordingDao_Impl.this.f32283a.m14537n();
                return Unit.f29502a;
            } finally {
                RecordingDao_Impl.this.f32283a.m14530f();
                SharedSQLiteStatement sharedSQLiteStatement = RecordingDao_Impl.this.f32286d;
                if (supportSQLiteStatementM14559a == sharedSQLiteStatement.f34367c) {
                    sharedSQLiteStatement.f34365a.set(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.d$b */
    /* JADX INFO: compiled from: RecordingDao_Impl.java */
    public class b implements Callable<List<RecordingEntity>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f32289a;

        public b(RoomSQLiteQuery roomSQLiteQuery) {
            this.f32289a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public List<RecordingEntity> call() throws Exception {
            b bVar;
            Boolean boolValueOf;
            Cursor cursorM14503b = DBUtil.m14503b(RecordingDao_Impl.this.f32283a, this.f32289a, false, null);
            try {
                int iM16940g = C8462c.m16940g(cursorM14503b, "id");
                int iM16940g2 = C8462c.m16940g(cursorM14503b, "name");
                int iM16940g3 = C8462c.m16940g(cursorM14503b, "userId");
                int iM16940g4 = C8462c.m16940g(cursorM14503b, "songId");
                int iM16940g5 = C8462c.m16940g(cursorM14503b, "duetId");
                int iM16940g6 = C8462c.m16940g(cursorM14503b, "message");
                int iM16940g7 = C8462c.m16940g(cursorM14503b, "thumbnail");
                int iM16940g8 = C8462c.m16940g(cursorM14503b, "url");
                int iM16940g9 = C8462c.m16940g(cursorM14503b, "type");
                int iM16940g10 = C8462c.m16940g(cursorM14503b, "imageIds");
                int iM16940g11 = C8462c.m16940g(cursorM14503b, "images");
                int iM16940g12 = C8462c.m16940g(cursorM14503b, CainMediaMetadataRetriever.METADATA_KEY_DURATION);
                int iM16940g13 = C8462c.m16940g(cursorM14503b, "effect");
                int iM16940g14 = C8462c.m16940g(cursorM14503b, "tone");
                try {
                    int iM16940g15 = C8462c.m16940g(cursorM14503b, "rhythm");
                    int iM16940g16 = C8462c.m16940g(cursorM14503b, "effectCustom");
                    int iM16940g17 = C8462c.m16940g(cursorM14503b, "useHeadphone");
                    int iM16940g18 = C8462c.m16940g(cursorM14503b, CainMediaMetadataRetriever.METADATA_KEY_FILENAME);
                    int iM16940g19 = C8462c.m16940g(cursorM14503b, "folderName");
                    int iM16940g20 = C8462c.m16940g(cursorM14503b, "segments");
                    int iM16940g21 = C8462c.m16940g(cursorM14503b, "format");
                    int iM16940g22 = C8462c.m16940g(cursorM14503b, "videoRatio");
                    int iM16940g23 = C8462c.m16940g(cursorM14503b, "createdAt");
                    int iM16940g24 = C8462c.m16940g(cursorM14503b, "updatedAt");
                    int i = iM16940g14;
                    ArrayList arrayList = new ArrayList(cursorM14503b.getCount());
                    while (cursorM14503b.moveToNext()) {
                        Long lValueOf = cursorM14503b.isNull(iM16940g) ? null : Long.valueOf(cursorM14503b.getLong(iM16940g));
                        String string = cursorM14503b.isNull(iM16940g2) ? null : cursorM14503b.getString(iM16940g2);
                        int i2 = cursorM14503b.getInt(iM16940g3);
                        int i3 = cursorM14503b.getInt(iM16940g4);
                        int i4 = cursorM14503b.getInt(iM16940g5);
                        String string2 = cursorM14503b.isNull(iM16940g6) ? null : cursorM14503b.getString(iM16940g6);
                        String string3 = cursorM14503b.isNull(iM16940g7) ? null : cursorM14503b.getString(iM16940g7);
                        String string4 = cursorM14503b.isNull(iM16940g8) ? null : cursorM14503b.getString(iM16940g8);
                        int i5 = cursorM14503b.getInt(iM16940g9);
                        String string5 = cursorM14503b.isNull(iM16940g10) ? null : cursorM14503b.getString(iM16940g10);
                        String string6 = cursorM14503b.isNull(iM16940g11) ? null : cursorM14503b.getString(iM16940g11);
                        Integer numValueOf = cursorM14503b.isNull(iM16940g12) ? null : Integer.valueOf(cursorM14503b.getInt(iM16940g12));
                        Integer numValueOf2 = cursorM14503b.isNull(iM16940g13) ? null : Integer.valueOf(cursorM14503b.getInt(iM16940g13));
                        int i6 = cursorM14503b.getInt(i);
                        int i7 = iM16940g;
                        int i8 = iM16940g15;
                        int i9 = cursorM14503b.getInt(i8);
                        iM16940g15 = i8;
                        iM16940g16 = iM16940g16;
                        String string7 = cursorM14503b.isNull(iM16940g16) ? null : cursorM14503b.getString(iM16940g16);
                        Integer numValueOf3 = cursorM14503b.isNull(iM16940g17) ? null : Integer.valueOf(cursorM14503b.getInt(iM16940g17));
                        if (numValueOf3 == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf3.intValue() != 0);
                        }
                        String string8 = cursorM14503b.isNull(iM16940g18) ? null : cursorM14503b.getString(iM16940g18);
                        String string9 = cursorM14503b.isNull(iM16940g19) ? null : cursorM14503b.getString(iM16940g19);
                        String string10 = cursorM14503b.isNull(iM16940g20) ? null : cursorM14503b.getString(iM16940g20);
                        int i10 = cursorM14503b.getInt(iM16940g21);
                        iM16940g21 = iM16940g21;
                        int i11 = iM16940g22;
                        int i12 = cursorM14503b.getInt(i11);
                        iM16940g22 = i11;
                        iM16940g23 = iM16940g23;
                        arrayList.add(new RecordingEntity(lValueOf, string, i2, i3, i4, string2, string3, string4, i5, string5, string6, numValueOf, numValueOf2, i6, i9, string7, boolValueOf, string8, string9, string10, i10, i12, cursorM14503b.isNull(iM16940g23) ? null : cursorM14503b.getString(iM16940g23), cursorM14503b.isNull(iM16940g24) ? null : cursorM14503b.getString(iM16940g24)));
                        iM16940g = i7;
                        i = i;
                    }
                    cursorM14503b.close();
                    this.f32289a.m14554h();
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    bVar = this;
                    cursorM14503b.close();
                    bVar.f32289a.m14554h();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bVar = this;
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.d$c */
    /* JADX INFO: compiled from: RecordingDao_Impl.java */
    public class c implements Callable<RecordingEntity> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f32291a;

        public c(RoomSQLiteQuery roomSQLiteQuery) {
            this.f32291a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public RecordingEntity call() throws Exception {
            RecordingEntity recordingEntity;
            Boolean boolValueOf;
            c cVar = this;
            Cursor cursorM14503b = DBUtil.m14503b(RecordingDao_Impl.this.f32283a, cVar.f32291a, false, null);
            try {
                int iM16940g = C8462c.m16940g(cursorM14503b, "id");
                int iM16940g2 = C8462c.m16940g(cursorM14503b, "name");
                int iM16940g3 = C8462c.m16940g(cursorM14503b, "userId");
                int iM16940g4 = C8462c.m16940g(cursorM14503b, "songId");
                int iM16940g5 = C8462c.m16940g(cursorM14503b, "duetId");
                int iM16940g6 = C8462c.m16940g(cursorM14503b, "message");
                int iM16940g7 = C8462c.m16940g(cursorM14503b, "thumbnail");
                int iM16940g8 = C8462c.m16940g(cursorM14503b, "url");
                int iM16940g9 = C8462c.m16940g(cursorM14503b, "type");
                int iM16940g10 = C8462c.m16940g(cursorM14503b, "imageIds");
                int iM16940g11 = C8462c.m16940g(cursorM14503b, "images");
                int iM16940g12 = C8462c.m16940g(cursorM14503b, CainMediaMetadataRetriever.METADATA_KEY_DURATION);
                int iM16940g13 = C8462c.m16940g(cursorM14503b, "effect");
                int iM16940g14 = C8462c.m16940g(cursorM14503b, "tone");
                try {
                    int iM16940g15 = C8462c.m16940g(cursorM14503b, "rhythm");
                    int iM16940g16 = C8462c.m16940g(cursorM14503b, "effectCustom");
                    int iM16940g17 = C8462c.m16940g(cursorM14503b, "useHeadphone");
                    int iM16940g18 = C8462c.m16940g(cursorM14503b, CainMediaMetadataRetriever.METADATA_KEY_FILENAME);
                    int iM16940g19 = C8462c.m16940g(cursorM14503b, "folderName");
                    int iM16940g20 = C8462c.m16940g(cursorM14503b, "segments");
                    int iM16940g21 = C8462c.m16940g(cursorM14503b, "format");
                    int iM16940g22 = C8462c.m16940g(cursorM14503b, "videoRatio");
                    int iM16940g23 = C8462c.m16940g(cursorM14503b, "createdAt");
                    int iM16940g24 = C8462c.m16940g(cursorM14503b, "updatedAt");
                    if (cursorM14503b.moveToFirst()) {
                        Long lValueOf = cursorM14503b.isNull(iM16940g) ? null : Long.valueOf(cursorM14503b.getLong(iM16940g));
                        String string = cursorM14503b.isNull(iM16940g2) ? null : cursorM14503b.getString(iM16940g2);
                        int i = cursorM14503b.getInt(iM16940g3);
                        int i2 = cursorM14503b.getInt(iM16940g4);
                        int i3 = cursorM14503b.getInt(iM16940g5);
                        String string2 = cursorM14503b.isNull(iM16940g6) ? null : cursorM14503b.getString(iM16940g6);
                        String string3 = cursorM14503b.isNull(iM16940g7) ? null : cursorM14503b.getString(iM16940g7);
                        String string4 = cursorM14503b.isNull(iM16940g8) ? null : cursorM14503b.getString(iM16940g8);
                        int i4 = cursorM14503b.getInt(iM16940g9);
                        String string5 = cursorM14503b.isNull(iM16940g10) ? null : cursorM14503b.getString(iM16940g10);
                        String string6 = cursorM14503b.isNull(iM16940g11) ? null : cursorM14503b.getString(iM16940g11);
                        Integer numValueOf = cursorM14503b.isNull(iM16940g12) ? null : Integer.valueOf(cursorM14503b.getInt(iM16940g12));
                        Integer numValueOf2 = cursorM14503b.isNull(iM16940g13) ? null : Integer.valueOf(cursorM14503b.getInt(iM16940g13));
                        int i5 = cursorM14503b.getInt(iM16940g14);
                        int i6 = cursorM14503b.getInt(iM16940g15);
                        String string7 = cursorM14503b.isNull(iM16940g16) ? null : cursorM14503b.getString(iM16940g16);
                        Integer numValueOf3 = cursorM14503b.isNull(r18) ? null : Integer.valueOf(cursorM14503b.getInt(iM16940g17));
                        if (numValueOf3 == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf3.intValue() != 0);
                        }
                        recordingEntity = new RecordingEntity(lValueOf, string, i, i2, i3, string2, string3, string4, i4, string5, string6, numValueOf, numValueOf2, i5, i6, string7, boolValueOf, cursorM14503b.isNull(r19) ? null : cursorM14503b.getString(iM16940g18), cursorM14503b.isNull(r20) ? null : cursorM14503b.getString(iM16940g19), cursorM14503b.isNull(r21) ? null : cursorM14503b.getString(iM16940g20), cursorM14503b.getInt(iM16940g21), cursorM14503b.getInt(iM16940g22), cursorM14503b.isNull(iM16940g23) ? null : cursorM14503b.getString(iM16940g23), cursorM14503b.isNull(iM16940g24) ? null : cursorM14503b.getString(iM16940g24));
                    } else {
                        recordingEntity = null;
                    }
                    cursorM14503b.close();
                    this.f32291a.m14554h();
                    return recordingEntity;
                } catch (Throwable th) {
                    th = th;
                    cVar = this;
                    cursorM14503b.close();
                    cVar.f32291a.m14554h();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.d$d */
    /* JADX INFO: compiled from: RecordingDao_Impl.java */
    public class d extends EntityInsertionAdapter<RecordingEntity> {
        public d(RecordingDao_Impl recordingDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "INSERT OR IGNORE INTO `recordings` (`id`,`name`,`userId`,`songId`,`duetId`,`message`,`thumbnail`,`url`,`type`,`imageIds`,`images`,`duration`,`effect`,`tone`,`rhythm`,`effectCustom`,`useHeadphone`,`filename`,`folderName`,`segments`,`format`,`videoRatio`,`createdAt`,`updatedAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p636z0.p641a0.EntityInsertionAdapter
        /* JADX INFO: renamed from: e */
        public void mo14040e(SupportSQLiteStatement supportSQLiteStatement, RecordingEntity recordingEntity) {
            RecordingEntity recordingEntity2 = recordingEntity;
            Long l = recordingEntity2.f32330f;
            if (l == null) {
                supportSQLiteStatement.mo14553d0(1);
            } else {
                supportSQLiteStatement.mo14549J(1, l.longValue());
            }
            String str = recordingEntity2.f32331g;
            if (str == null) {
                supportSQLiteStatement.mo14553d0(2);
            } else {
                supportSQLiteStatement.mo14555o(2, str);
            }
            supportSQLiteStatement.mo14549J(3, recordingEntity2.f32332h);
            supportSQLiteStatement.mo14549J(4, recordingEntity2.f32333i);
            supportSQLiteStatement.mo14549J(5, recordingEntity2.f32334j);
            String str2 = recordingEntity2.f32335k;
            if (str2 == null) {
                supportSQLiteStatement.mo14553d0(6);
            } else {
                supportSQLiteStatement.mo14555o(6, str2);
            }
            String str3 = recordingEntity2.f32336l;
            if (str3 == null) {
                supportSQLiteStatement.mo14553d0(7);
            } else {
                supportSQLiteStatement.mo14555o(7, str3);
            }
            String str4 = recordingEntity2.f32337m;
            if (str4 == null) {
                supportSQLiteStatement.mo14553d0(8);
            } else {
                supportSQLiteStatement.mo14555o(8, str4);
            }
            supportSQLiteStatement.mo14549J(9, recordingEntity2.f32338n);
            String str5 = recordingEntity2.f32339o;
            if (str5 == null) {
                supportSQLiteStatement.mo14553d0(10);
            } else {
                supportSQLiteStatement.mo14555o(10, str5);
            }
            String str6 = recordingEntity2.f32340p;
            if (str6 == null) {
                supportSQLiteStatement.mo14553d0(11);
            } else {
                supportSQLiteStatement.mo14555o(11, str6);
            }
            Integer num = recordingEntity2.f32341q;
            if (num == null) {
                supportSQLiteStatement.mo14553d0(12);
            } else {
                supportSQLiteStatement.mo14549J(12, num.intValue());
            }
            Integer num2 = recordingEntity2.f32342r;
            if (num2 == null) {
                supportSQLiteStatement.mo14553d0(13);
            } else {
                supportSQLiteStatement.mo14549J(13, num2.intValue());
            }
            supportSQLiteStatement.mo14549J(14, recordingEntity2.f32343s);
            supportSQLiteStatement.mo14549J(15, recordingEntity2.f32344t);
            String str7 = recordingEntity2.f32345u;
            if (str7 == null) {
                supportSQLiteStatement.mo14553d0(16);
            } else {
                supportSQLiteStatement.mo14555o(16, str7);
            }
            Boolean bool = recordingEntity2.f32346v;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                supportSQLiteStatement.mo14553d0(17);
            } else {
                supportSQLiteStatement.mo14549J(17, numValueOf.intValue());
            }
            String str8 = recordingEntity2.f32347w;
            if (str8 == null) {
                supportSQLiteStatement.mo14553d0(18);
            } else {
                supportSQLiteStatement.mo14555o(18, str8);
            }
            String str9 = recordingEntity2.f32348x;
            if (str9 == null) {
                supportSQLiteStatement.mo14553d0(19);
            } else {
                supportSQLiteStatement.mo14555o(19, str9);
            }
            String str10 = recordingEntity2.f32349y;
            if (str10 == null) {
                supportSQLiteStatement.mo14553d0(20);
            } else {
                supportSQLiteStatement.mo14555o(20, str10);
            }
            supportSQLiteStatement.mo14549J(21, recordingEntity2.f32350z);
            supportSQLiteStatement.mo14549J(22, recordingEntity2.f32327A);
            String str11 = recordingEntity2.f32328B;
            if (str11 == null) {
                supportSQLiteStatement.mo14553d0(23);
            } else {
                supportSQLiteStatement.mo14555o(23, str11);
            }
            String str12 = recordingEntity2.f32329C;
            if (str12 == null) {
                supportSQLiteStatement.mo14553d0(24);
            } else {
                supportSQLiteStatement.mo14555o(24, str12);
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.d$e */
    /* JADX INFO: compiled from: RecordingDao_Impl.java */
    public class e extends EntityInsertionAdapter<RecordingEntity> {
        public e(RecordingDao_Impl recordingDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "INSERT OR REPLACE INTO `recordings` (`id`,`name`,`userId`,`songId`,`duetId`,`message`,`thumbnail`,`url`,`type`,`imageIds`,`images`,`duration`,`effect`,`tone`,`rhythm`,`effectCustom`,`useHeadphone`,`filename`,`folderName`,`segments`,`format`,`videoRatio`,`createdAt`,`updatedAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p636z0.p641a0.EntityInsertionAdapter
        /* JADX INFO: renamed from: e */
        public void mo14040e(SupportSQLiteStatement supportSQLiteStatement, RecordingEntity recordingEntity) {
            RecordingEntity recordingEntity2 = recordingEntity;
            Long l = recordingEntity2.f32330f;
            if (l == null) {
                supportSQLiteStatement.mo14553d0(1);
            } else {
                supportSQLiteStatement.mo14549J(1, l.longValue());
            }
            String str = recordingEntity2.f32331g;
            if (str == null) {
                supportSQLiteStatement.mo14553d0(2);
            } else {
                supportSQLiteStatement.mo14555o(2, str);
            }
            supportSQLiteStatement.mo14549J(3, recordingEntity2.f32332h);
            supportSQLiteStatement.mo14549J(4, recordingEntity2.f32333i);
            supportSQLiteStatement.mo14549J(5, recordingEntity2.f32334j);
            String str2 = recordingEntity2.f32335k;
            if (str2 == null) {
                supportSQLiteStatement.mo14553d0(6);
            } else {
                supportSQLiteStatement.mo14555o(6, str2);
            }
            String str3 = recordingEntity2.f32336l;
            if (str3 == null) {
                supportSQLiteStatement.mo14553d0(7);
            } else {
                supportSQLiteStatement.mo14555o(7, str3);
            }
            String str4 = recordingEntity2.f32337m;
            if (str4 == null) {
                supportSQLiteStatement.mo14553d0(8);
            } else {
                supportSQLiteStatement.mo14555o(8, str4);
            }
            supportSQLiteStatement.mo14549J(9, recordingEntity2.f32338n);
            String str5 = recordingEntity2.f32339o;
            if (str5 == null) {
                supportSQLiteStatement.mo14553d0(10);
            } else {
                supportSQLiteStatement.mo14555o(10, str5);
            }
            String str6 = recordingEntity2.f32340p;
            if (str6 == null) {
                supportSQLiteStatement.mo14553d0(11);
            } else {
                supportSQLiteStatement.mo14555o(11, str6);
            }
            Integer num = recordingEntity2.f32341q;
            if (num == null) {
                supportSQLiteStatement.mo14553d0(12);
            } else {
                supportSQLiteStatement.mo14549J(12, num.intValue());
            }
            Integer num2 = recordingEntity2.f32342r;
            if (num2 == null) {
                supportSQLiteStatement.mo14553d0(13);
            } else {
                supportSQLiteStatement.mo14549J(13, num2.intValue());
            }
            supportSQLiteStatement.mo14549J(14, recordingEntity2.f32343s);
            supportSQLiteStatement.mo14549J(15, recordingEntity2.f32344t);
            String str7 = recordingEntity2.f32345u;
            if (str7 == null) {
                supportSQLiteStatement.mo14553d0(16);
            } else {
                supportSQLiteStatement.mo14555o(16, str7);
            }
            Boolean bool = recordingEntity2.f32346v;
            Integer numValueOf = bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                supportSQLiteStatement.mo14553d0(17);
            } else {
                supportSQLiteStatement.mo14549J(17, numValueOf.intValue());
            }
            String str8 = recordingEntity2.f32347w;
            if (str8 == null) {
                supportSQLiteStatement.mo14553d0(18);
            } else {
                supportSQLiteStatement.mo14555o(18, str8);
            }
            String str9 = recordingEntity2.f32348x;
            if (str9 == null) {
                supportSQLiteStatement.mo14553d0(19);
            } else {
                supportSQLiteStatement.mo14555o(19, str9);
            }
            String str10 = recordingEntity2.f32349y;
            if (str10 == null) {
                supportSQLiteStatement.mo14553d0(20);
            } else {
                supportSQLiteStatement.mo14555o(20, str10);
            }
            supportSQLiteStatement.mo14549J(21, recordingEntity2.f32350z);
            supportSQLiteStatement.mo14549J(22, recordingEntity2.f32327A);
            String str11 = recordingEntity2.f32328B;
            if (str11 == null) {
                supportSQLiteStatement.mo14553d0(23);
            } else {
                supportSQLiteStatement.mo14555o(23, str11);
            }
            String str12 = recordingEntity2.f32329C;
            if (str12 == null) {
                supportSQLiteStatement.mo14553d0(24);
            } else {
                supportSQLiteStatement.mo14555o(24, str12);
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.d$f */
    /* JADX INFO: compiled from: RecordingDao_Impl.java */
    public class f extends EntityDeletionOrUpdateAdapter<RecordingEntity> {
        public f(RecordingDao_Impl recordingDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "DELETE FROM `recordings` WHERE `id` = ?";
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.d$g */
    /* JADX INFO: compiled from: RecordingDao_Impl.java */
    public class g extends SharedSQLiteStatement {
        public g(RecordingDao_Impl recordingDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "DELETE FROM recordings WHERE id = ?";
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.d$h */
    /* JADX INFO: compiled from: RecordingDao_Impl.java */
    public class h extends SharedSQLiteStatement {
        public h(RecordingDao_Impl recordingDao_Impl, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p636z0.p641a0.SharedSQLiteStatement
        /* JADX INFO: renamed from: c */
        public String mo14039c() {
            return "DELETE FROM recordings";
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.d$i */
    /* JADX INFO: compiled from: RecordingDao_Impl.java */
    public class i implements Callable<Long> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecordingEntity f32293a;

        public i(RecordingEntity recordingEntity) {
            this.f32293a = recordingEntity;
        }

        @Override // java.util.concurrent.Callable
        public Long call() throws Exception {
            RecordingDao_Impl.this.f32283a.m14529c();
            try {
                EntityInsertionAdapter<RecordingEntity> entityInsertionAdapter = RecordingDao_Impl.this.f32284b;
                RecordingEntity recordingEntity = this.f32293a;
                SupportSQLiteStatement supportSQLiteStatementM14559a = entityInsertionAdapter.m14559a();
                try {
                    entityInsertionAdapter.mo14040e(supportSQLiteStatementM14559a, recordingEntity);
                    long jMo15050A0 = supportSQLiteStatementM14559a.mo15050A0();
                    if (supportSQLiteStatementM14559a == entityInsertionAdapter.f34367c) {
                        entityInsertionAdapter.f34365a.set(false);
                    }
                    RecordingDao_Impl.this.f32283a.m14537n();
                    Long lValueOf = Long.valueOf(jMo15050A0);
                    RecordingDao_Impl.this.f32283a.m14530f();
                    return lValueOf;
                } catch (Throwable th) {
                    entityInsertionAdapter.m14561d(supportSQLiteStatementM14559a);
                    throw th;
                }
            } catch (Throwable th2) {
                RecordingDao_Impl.this.f32283a.m14530f();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.h.c.a.d$j */
    /* JADX INFO: compiled from: RecordingDao_Impl.java */
    public class j implements Callable<Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecordingEntity f32295a;

        public j(RecordingEntity recordingEntity) {
            this.f32295a = recordingEntity;
        }

        @Override // java.util.concurrent.Callable
        public Unit call() throws Exception {
            RecordingDao_Impl.this.f32283a.m14529c();
            try {
                RecordingDao_Impl.this.f32285c.m14513f(this.f32295a);
                RecordingDao_Impl.this.f32283a.m14537n();
                return Unit.f29502a;
            } finally {
                RecordingDao_Impl.this.f32283a.m14530f();
            }
        }
    }

    public RecordingDao_Impl(RoomDatabase roomDatabase) {
        this.f32283a = roomDatabase;
        this.f32284b = new d(this, roomDatabase);
        this.f32285c = new e(this, roomDatabase);
        new f(this, roomDatabase);
        this.f32286d = new g(this, roomDatabase);
        new h(this, roomDatabase);
    }

    @Override // p555j.p556a.p557a.p606h.p609c.p610a.RecordingDao
    /* JADX INFO: renamed from: a */
    public Object mo14041a(long j2, Continuation<? super RecordingEntity> continuation) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT * FROM recordings WHERE id = ?", 1);
        roomSQLiteQueryM14548f.mo14549J(1, j2);
        return CoroutinesRoom4.m14510a(this.f32283a, false, new CancellationSignal(), new c(roomSQLiteQueryM14548f), continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p609c.p610a.RecordingDao
    /* JADX INFO: renamed from: b */
    public Object mo14042b(RecordingEntity recordingEntity, Continuation<? super Long> continuation) {
        return CoroutinesRoom4.m14511b(this.f32283a, true, new i(recordingEntity), continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p609c.p610a.RecordingDao
    /* JADX INFO: renamed from: c */
    public Object mo14043c(RecordingEntity recordingEntity, Continuation<? super Unit> continuation) {
        return CoroutinesRoom4.m14511b(this.f32283a, true, new j(recordingEntity), continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p609c.p610a.RecordingDao
    /* JADX INFO: renamed from: d */
    public Object mo14044d(Continuation<? super List<RecordingEntity>> continuation) {
        RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT * FROM recordings ORDER BY id DESC", 0);
        return CoroutinesRoom4.m14510a(this.f32283a, false, new CancellationSignal(), new b(roomSQLiteQueryM14548f), continuation);
    }

    @Override // p555j.p556a.p557a.p606h.p609c.p610a.RecordingDao
    /* JADX INFO: renamed from: e */
    public Object mo14045e(long j2, Continuation<? super Unit> continuation) {
        return CoroutinesRoom4.m14511b(this.f32283a, true, new a(j2), continuation);
    }
}
