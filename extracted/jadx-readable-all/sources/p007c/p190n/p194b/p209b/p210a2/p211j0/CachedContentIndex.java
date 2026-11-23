package p007c.p190n.p194b.p209b.p210a2.p211j0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.p212b2.AtomicFile;
import p007c.p190n.p194b.p209b.p212b2.ReusableBufferedOutputStream;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p216o1.DatabaseIOException;
import p007c.p190n.p194b.p209b.p216o1.DatabaseProvider;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.l, reason: use source file name */
/* JADX INFO: compiled from: CachedContentIndex.java */
/* JADX INFO: loaded from: classes.dex */
public class CachedContentIndex {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, CachedContent> f6087a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<String> f6088b;

    /* JADX INFO: renamed from: c */
    public final SparseBooleanArray f6089c;

    /* JADX INFO: renamed from: d */
    public final SparseBooleanArray f6090d;

    /* JADX INFO: renamed from: e */
    public c f6091e;

    /* JADX INFO: renamed from: f */
    public c f6092f;

    /* JADX INFO: renamed from: c.n.b.b.a2.j0.l$a */
    /* JADX INFO: compiled from: CachedContentIndex.java */
    public static final class a implements c {

        /* JADX INFO: renamed from: a */
        public static final String[] f6093a = {"id", "key", "metadata"};

        /* JADX INFO: renamed from: b */
        public final DatabaseProvider f6094b;

        /* JADX INFO: renamed from: c */
        public final SparseArray<CachedContent> f6095c = new SparseArray<>();

        /* JADX INFO: renamed from: d */
        public String f6096d;

        /* JADX INFO: renamed from: e */
        public String f6097e;

        public a(DatabaseProvider databaseProvider) {
            this.f6094b = databaseProvider;
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: a */
        public void mo2970a(CachedContent cachedContent, boolean z) {
            if (z) {
                this.f6095c.delete(cachedContent.f6080a);
            } else {
                this.f6095c.put(cachedContent.f6080a, null);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: b */
        public void mo2971b(HashMap<String, CachedContent> map) throws IOException {
            try {
                SQLiteDatabase sQLiteDatabaseM3623e = this.f6094b.m3623e();
                sQLiteDatabaseM3623e.beginTransactionNonExclusive();
                try {
                    m2979j(sQLiteDatabaseM3623e);
                    Iterator<CachedContent> it = map.values().iterator();
                    while (it.hasNext()) {
                        m2978i(sQLiteDatabaseM3623e, it.next());
                    }
                    sQLiteDatabaseM3623e.setTransactionSuccessful();
                    this.f6095c.clear();
                } finally {
                    sQLiteDatabaseM3623e.endTransaction();
                }
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: c */
        public void mo2972c(CachedContent cachedContent) {
            this.f6095c.put(cachedContent.f6080a, cachedContent);
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: d */
        public boolean mo2973d() throws DatabaseIOException {
            SQLiteDatabase sQLiteDatabaseM3622a = this.f6094b.m3622a();
            String str = this.f6096d;
            Objects.requireNonNull(str);
            return C1095a.m2401q(sQLiteDatabaseM3622a, 1, str) != -1;
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: e */
        public void mo2974e(HashMap<String, CachedContent> map) throws IOException {
            if (this.f6095c.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase sQLiteDatabaseM3623e = this.f6094b.m3623e();
                sQLiteDatabaseM3623e.beginTransactionNonExclusive();
                for (int i = 0; i < this.f6095c.size(); i++) {
                    try {
                        CachedContent cachedContentValueAt = this.f6095c.valueAt(i);
                        if (cachedContentValueAt == null) {
                            int iKeyAt = this.f6095c.keyAt(i);
                            String str = this.f6097e;
                            Objects.requireNonNull(str);
                            sQLiteDatabaseM3623e.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                        } else {
                            m2978i(sQLiteDatabaseM3623e, cachedContentValueAt);
                        }
                    } catch (Throwable th) {
                        sQLiteDatabaseM3623e.endTransaction();
                        throw th;
                    }
                }
                sQLiteDatabaseM3623e.setTransactionSuccessful();
                this.f6095c.clear();
                sQLiteDatabaseM3623e.endTransaction();
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: f */
        public void mo2975f(long j2) {
            String hexString = Long.toHexString(j2);
            this.f6096d = hexString;
            this.f6097e = outline.m1599u("ExoPlayerCacheIndex", hexString);
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: g */
        public void mo2976g(HashMap<String, CachedContent> map, SparseArray<String> sparseArray) throws IOException {
            C2096e.m4570f(this.f6095c.size() == 0);
            try {
                SQLiteDatabase sQLiteDatabaseM3622a = this.f6094b.m3622a();
                String str = this.f6096d;
                Objects.requireNonNull(str);
                if (C1095a.m2401q(sQLiteDatabaseM3622a, 1, str) != 1) {
                    SQLiteDatabase sQLiteDatabaseM3623e = this.f6094b.m3623e();
                    sQLiteDatabaseM3623e.beginTransactionNonExclusive();
                    try {
                        m2979j(sQLiteDatabaseM3623e);
                        sQLiteDatabaseM3623e.setTransactionSuccessful();
                        sQLiteDatabaseM3623e.endTransaction();
                    } catch (Throwable th) {
                        sQLiteDatabaseM3623e.endTransaction();
                        throw th;
                    }
                }
                SQLiteDatabase sQLiteDatabaseM3622a2 = this.f6094b.m3622a();
                String str2 = this.f6097e;
                Objects.requireNonNull(str2);
                Cursor cursorQuery = sQLiteDatabaseM3622a2.query(str2, f6093a, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        CachedContent cachedContent = new CachedContent(cursorQuery.getInt(0), cursorQuery.getString(1), CachedContentIndex.m2963a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2)))));
                        map.put(cachedContent.f6081b, cachedContent);
                        sparseArray.put(cachedContent.f6080a, cachedContent.f6081b);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Throwable th4) {
                                    th2.addSuppressed(th4);
                                }
                            }
                            throw th3;
                        }
                    }
                }
                cursorQuery.close();
            } catch (SQLiteException e) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: h */
        public void mo2977h() throws DatabaseIOException {
            DatabaseProvider databaseProvider = this.f6094b;
            String str = this.f6096d;
            Objects.requireNonNull(str);
            try {
                String str2 = "ExoPlayerCacheIndex" + str;
                SQLiteDatabase sQLiteDatabaseM3623e = databaseProvider.m3623e();
                sQLiteDatabaseM3623e.beginTransactionNonExclusive();
                try {
                    try {
                        if (Util6.m3109R(sQLiteDatabaseM3623e, "ExoPlayerVersions")) {
                            sQLiteDatabaseM3623e.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                        }
                        sQLiteDatabaseM3623e.execSQL("DROP TABLE IF EXISTS " + str2);
                        sQLiteDatabaseM3623e.setTransactionSuccessful();
                        sQLiteDatabaseM3623e.endTransaction();
                    } catch (SQLException e) {
                        throw new DatabaseIOException(e);
                    }
                } catch (Throwable th) {
                    sQLiteDatabaseM3623e.endTransaction();
                    throw th;
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m2978i(SQLiteDatabase sQLiteDatabase, CachedContent cachedContent) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CachedContentIndex.m2964b(cachedContent.f6084e, new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(cachedContent.f6080a));
            contentValues.put("key", cachedContent.f6081b);
            contentValues.put("metadata", byteArray);
            String str = this.f6097e;
            Objects.requireNonNull(str);
            sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        }

        /* JADX INFO: renamed from: j */
        public final void m2979j(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            String str = this.f6096d;
            Objects.requireNonNull(str);
            C1095a.m2380G(sQLiteDatabase, 1, str, 1);
            String str2 = this.f6097e;
            Objects.requireNonNull(str2);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f6097e + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.j0.l$b */
    /* JADX INFO: compiled from: CachedContentIndex.java */
    public static class b implements c {

        /* JADX INFO: renamed from: a */
        public final boolean f6098a;

        /* JADX INFO: renamed from: b */
        public final Cipher f6099b;

        /* JADX INFO: renamed from: c */
        public final SecretKeySpec f6100c;

        /* JADX INFO: renamed from: d */
        public final SecureRandom f6101d;

        /* JADX INFO: renamed from: e */
        public final AtomicFile f6102e;

        /* JADX INFO: renamed from: f */
        public boolean f6103f;

        /* JADX INFO: renamed from: g */
        public ReusableBufferedOutputStream f6104g;

        public b(File file, byte[] bArr, boolean z) {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            C2096e.m4570f((bArr == null && z) ? false : true);
            if (bArr != null) {
                C2096e.m4566b(bArr.length == 16);
                try {
                    if (Util6.f6307a == 18) {
                        try {
                            cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
                        } catch (Throwable unused) {
                            cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                        }
                    } else {
                        cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    }
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                C2096e.m4566b(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.f6098a = z;
            this.f6099b = cipher;
            this.f6100c = secretKeySpec;
            this.f6101d = z ? new SecureRandom() : null;
            this.f6102e = new AtomicFile(file);
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: a */
        public void mo2970a(CachedContent cachedContent, boolean z) {
            this.f6103f = true;
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: b */
        public void mo2971b(HashMap<String, CachedContent> map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamM3077c = this.f6102e.m3077c();
                ReusableBufferedOutputStream reusableBufferedOutputStream = this.f6104g;
                if (reusableBufferedOutputStream == null) {
                    this.f6104g = new ReusableBufferedOutputStream(outputStreamM3077c);
                } else {
                    reusableBufferedOutputStream.m3234a(outputStreamM3077c);
                }
                ReusableBufferedOutputStream reusableBufferedOutputStream2 = this.f6104g;
                DataOutputStream dataOutputStream2 = new DataOutputStream(reusableBufferedOutputStream2);
                try {
                    dataOutputStream2.writeInt(2);
                    dataOutputStream2.writeInt(this.f6098a ? 1 : 0);
                    if (this.f6098a) {
                        byte[] bArr = new byte[16];
                        SecureRandom secureRandom = this.f6101d;
                        int i = Util6.f6307a;
                        secureRandom.nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            this.f6099b.init(1, this.f6100c, new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(reusableBufferedOutputStream2, this.f6099b));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    int iM2980i = 0;
                    for (CachedContent cachedContent : map.values()) {
                        dataOutputStream2.writeInt(cachedContent.f6080a);
                        dataOutputStream2.writeUTF(cachedContent.f6081b);
                        CachedContentIndex.m2964b(cachedContent.f6084e, dataOutputStream2);
                        iM2980i += m2980i(cachedContent, 2);
                    }
                    dataOutputStream2.writeInt(iM2980i);
                    AtomicFile atomicFile = this.f6102e;
                    Objects.requireNonNull(atomicFile);
                    dataOutputStream2.close();
                    atomicFile.f6293b.delete();
                    int i2 = Util6.f6307a;
                    this.f6103f = false;
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    int i3 = Util6.f6307a;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: c */
        public void mo2972c(CachedContent cachedContent) {
            this.f6103f = true;
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: d */
        public boolean mo2973d() {
            return this.f6102e.m3075a();
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: e */
        public void mo2974e(HashMap<String, CachedContent> map) throws Throwable {
            if (this.f6103f) {
                mo2971b(map);
            }
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: f */
        public void mo2975f(long j2) {
        }

        /* JADX WARN: Code duplicated, block: B:60:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: g */
        public void mo2976g(HashMap<String, CachedContent> map, SparseArray<String> sparseArray) throws Throwable {
            boolean z = true;
            C2096e.m4570f(!this.f6103f);
            if (this.f6102e.m3075a()) {
                DataInputStream dataInputStream = null;
                try {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f6102e.m3076b());
                        DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                        try {
                            int i = dataInputStream2.readInt();
                            if (i >= 0 && i <= 2) {
                                if ((dataInputStream2.readInt() & 1) != 0) {
                                    if (this.f6099b != null) {
                                        byte[] bArr = new byte[16];
                                        dataInputStream2.readFully(bArr);
                                        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                        try {
                                            Cipher cipher = this.f6099b;
                                            SecretKeySpec secretKeySpec = this.f6100c;
                                            int i2 = Util6.f6307a;
                                            cipher.init(2, secretKeySpec, ivParameterSpec);
                                            dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f6099b));
                                        } catch (InvalidAlgorithmParameterException e) {
                                            e = e;
                                            throw new IllegalStateException(e);
                                        } catch (InvalidKeyException e2) {
                                            e = e2;
                                            throw new IllegalStateException(e);
                                        }
                                    }
                                } else if (this.f6098a) {
                                    this.f6103f = true;
                                }
                                int i3 = dataInputStream2.readInt();
                                int iM2980i = 0;
                                for (int i4 = 0; i4 < i3; i4++) {
                                    CachedContent cachedContentM2981j = m2981j(i, dataInputStream2);
                                    map.put(cachedContentM2981j.f6081b, cachedContentM2981j);
                                    sparseArray.put(cachedContentM2981j.f6080a, cachedContentM2981j.f6081b);
                                    iM2980i += m2980i(cachedContentM2981j, i);
                                }
                                int i5 = dataInputStream2.readInt();
                                boolean z2 = dataInputStream2.read() == -1;
                                if (i5 == iM2980i && z2) {
                                    int i6 = Util6.f6307a;
                                    try {
                                        dataInputStream2.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                            int i7 = Util6.f6307a;
                            dataInputStream2.close();
                        } catch (IOException unused2) {
                            dataInputStream = dataInputStream2;
                            if (dataInputStream != null) {
                                int i8 = Util6.f6307a;
                                dataInputStream.close();
                            }
                            z = false;
                            if (z) {
                            }
                            map.clear();
                            sparseArray.clear();
                            AtomicFile atomicFile = this.f6102e;
                            atomicFile.f6292a.delete();
                            atomicFile.f6293b.delete();
                        } catch (Throwable th) {
                            th = th;
                            dataInputStream = dataInputStream2;
                            if (dataInputStream != null) {
                                int i9 = Util6.f6307a;
                                try {
                                    dataInputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused4) {
                    }
                } catch (IOException unused5) {
                } catch (Throwable th2) {
                    th = th2;
                }
                z = false;
            }
            if (z) {
                map.clear();
                sparseArray.clear();
                AtomicFile atomicFile2 = this.f6102e;
                atomicFile2.f6292a.delete();
                atomicFile2.f6293b.delete();
            }
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.p211j0.CachedContentIndex.c
        /* JADX INFO: renamed from: h */
        public void mo2977h() {
            AtomicFile atomicFile = this.f6102e;
            atomicFile.f6292a.delete();
            atomicFile.f6293b.delete();
        }

        /* JADX INFO: renamed from: i */
        public final int m2980i(CachedContent cachedContent, int i) {
            int iHashCode = cachedContent.f6081b.hashCode() + (cachedContent.f6080a * 31);
            if (i >= 2) {
                return (iHashCode * 31) + cachedContent.f6084e.hashCode();
            }
            long jM2982a = ContentMetadata.m2982a(cachedContent.f6084e);
            return (iHashCode * 31) + ((int) (jM2982a ^ (jM2982a >>> 32)));
        }

        /* JADX INFO: renamed from: j */
        public final CachedContent m2981j(int i, DataInputStream dataInputStream) throws IOException {
            DefaultContentMetadata defaultContentMetadataM2963a;
            int i2 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i < 2) {
                long j2 = dataInputStream.readLong();
                ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
                ContentMetadataMutations.m2983a(contentMetadataMutations, j2);
                defaultContentMetadataM2963a = DefaultContentMetadata.f6107a.m2985a(contentMetadataMutations);
            } else {
                defaultContentMetadataM2963a = CachedContentIndex.m2963a(dataInputStream);
            }
            return new CachedContent(i2, utf, defaultContentMetadataM2963a);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.j0.l$c */
    /* JADX INFO: compiled from: CachedContentIndex.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo2970a(CachedContent cachedContent, boolean z);

        /* JADX INFO: renamed from: b */
        void mo2971b(HashMap<String, CachedContent> map) throws IOException;

        /* JADX INFO: renamed from: c */
        void mo2972c(CachedContent cachedContent);

        /* JADX INFO: renamed from: d */
        boolean mo2973d() throws IOException;

        /* JADX INFO: renamed from: e */
        void mo2974e(HashMap<String, CachedContent> map) throws IOException;

        /* JADX INFO: renamed from: f */
        void mo2975f(long j2);

        /* JADX INFO: renamed from: g */
        void mo2976g(HashMap<String, CachedContent> map, SparseArray<String> sparseArray) throws IOException;

        /* JADX INFO: renamed from: h */
        void mo2977h() throws IOException;
    }

    public CachedContentIndex(DatabaseProvider databaseProvider) {
        this(databaseProvider, null, null, false, false);
    }

    /* JADX INFO: renamed from: a */
    public static DefaultContentMetadata m2963a(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(outline.m1590l("Invalid value size: ", i3));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = Util6.f6312f;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new DefaultContentMetadata(map);
    }

    /* JADX INFO: renamed from: b */
    public static void m2964b(DefaultContentMetadata defaultContentMetadata, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setEntrySet = defaultContentMetadata.f6109c.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry<String, byte[]> entry : setEntrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    /* JADX INFO: renamed from: c */
    public CachedContent m2965c(String str) {
        return this.f6087a.get(str);
    }

    /* JADX INFO: renamed from: d */
    public CachedContent m2966d(String str) {
        CachedContent cachedContent = this.f6087a.get(str);
        if (cachedContent != null) {
            return cachedContent;
        }
        SparseArray<String> sparseArray = this.f6088b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        CachedContent cachedContent2 = new CachedContent(iKeyAt, str);
        this.f6087a.put(str, cachedContent2);
        this.f6088b.put(iKeyAt, str);
        this.f6090d.put(iKeyAt, true);
        this.f6091e.mo2972c(cachedContent2);
        return cachedContent2;
    }

    /* JADX INFO: renamed from: e */
    public void m2967e(long j2) throws IOException {
        c cVar;
        this.f6091e.mo2975f(j2);
        c cVar2 = this.f6092f;
        if (cVar2 != null) {
            cVar2.mo2975f(j2);
        }
        if (this.f6091e.mo2973d() || (cVar = this.f6092f) == null || !cVar.mo2973d()) {
            this.f6091e.mo2976g(this.f6087a, this.f6088b);
        } else {
            this.f6092f.mo2976g(this.f6087a, this.f6088b);
            this.f6091e.mo2971b(this.f6087a);
        }
        c cVar3 = this.f6092f;
        if (cVar3 != null) {
            cVar3.mo2977h();
            this.f6092f = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m2968f(String str) {
        CachedContent cachedContent = this.f6087a.get(str);
        if (cachedContent != null && cachedContent.f6082c.isEmpty() && cachedContent.f6083d.isEmpty()) {
            this.f6087a.remove(str);
            int i = cachedContent.f6080a;
            boolean z = this.f6090d.get(i);
            this.f6091e.mo2970a(cachedContent, z);
            if (z) {
                this.f6088b.remove(i);
                this.f6090d.delete(i);
            } else {
                this.f6088b.put(i, null);
                this.f6089c.put(i, true);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2969g() throws IOException {
        this.f6091e.mo2974e(this.f6087a);
        int size = this.f6089c.size();
        for (int i = 0; i < size; i++) {
            this.f6088b.remove(this.f6089c.keyAt(i));
        }
        this.f6089c.clear();
        this.f6090d.clear();
    }

    public CachedContentIndex(DatabaseProvider databaseProvider, File file, byte[] bArr, boolean z, boolean z2) {
        C2096e.m4570f((databaseProvider == null && file == null) ? false : true);
        this.f6087a = new HashMap<>();
        this.f6088b = new SparseArray<>();
        this.f6089c = new SparseBooleanArray();
        this.f6090d = new SparseBooleanArray();
        a aVar = databaseProvider != null ? new a(databaseProvider) : null;
        b bVar = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z) : null;
        if (aVar != null && (bVar == null || !z2)) {
            this.f6091e = aVar;
            this.f6092f = bVar;
        } else {
            int i = Util6.f6307a;
            this.f6091e = bVar;
            this.f6092f = aVar;
        }
    }
}
