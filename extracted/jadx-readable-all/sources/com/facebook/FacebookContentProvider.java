package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;
import p007c.p165l.p178k0.NativeAppCallAttachmentStore;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: loaded from: classes.dex */
public class FacebookContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: f */
    public static final String f28293f = FacebookContentProvider.class.getName();

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
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        Pair pair;
        try {
            String[] strArrSplit = uri.getPath().substring(1).split("/");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[1];
            if ("..".contentEquals(str2) || "..".contentEquals(str3)) {
                throw new Exception();
            }
            pair = new Pair(UUID.fromString(str2), str3);
            if (pair == null) {
                throw new FileNotFoundException();
            }
            try {
                UUID uuid = (UUID) pair.first;
                String str4 = (String) pair.second;
                String str5 = NativeAppCallAttachmentStore.f5048a;
                if (Utility.m2466y(str4) || uuid == null) {
                    throw new FileNotFoundException();
                }
                try {
                    File fileM2534b = NativeAppCallAttachmentStore.m2534b(uuid, str4, false);
                    if (fileM2534b != null) {
                        return ParcelFileDescriptor.open(fileM2534b, 268435456);
                    }
                    throw new FileNotFoundException();
                } catch (IOException unused) {
                    throw new FileNotFoundException();
                }
            } catch (FileNotFoundException e) {
                Log.e(f28293f, "Got unexpected exception:" + e);
                throw e;
            }
        } catch (Exception unused2) {
            pair = null;
        }
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
