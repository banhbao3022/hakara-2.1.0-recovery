package p636z0.p725k.p736i;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.k.i.d, reason: use source file name */
/* JADX INFO: compiled from: FontProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class FontProvider {

    /* JADX INFO: renamed from: a */
    public static final Comparator<byte[]> f37901a = new a();

    /* JADX INFO: renamed from: z0.k.i.d$a */
    /* JADX INFO: compiled from: FontProvider.java */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length == bArr4.length) {
                for (int i = 0; i < bArr3.length; i++) {
                    if (bArr3[i] != bArr4[i]) {
                        length = bArr3[i];
                        length2 = bArr4[i];
                    }
                }
                return 0;
            }
            length = bArr3.length;
            length2 = bArr4.length;
            return length - length2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static FontsContractCompat m16205a(Context context, FontRequest fontRequest, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        Cursor cursorQuery;
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = fontRequest.f37902a;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(outline.m1599u("No package found for authority: ", str));
        }
        if (!providerInfoResolveContentProvider.packageName.equals(fontRequest.f37903b)) {
            StringBuilder sbM1562M = outline.m1562M("Found content provider ", str, ", but package was not ");
            sbM1562M.append(fontRequest.f37903b);
            throw new PackageManager.NameNotFoundException(sbM1562M.toString());
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        Collections.sort(arrayList, f37901a);
        List<List<byte[]>> listM16040K = fontRequest.f37905d;
        if (listM16040K == null) {
            listM16040K = C8162a.m16040K(resources, fontRequest.f37906e);
        }
        int i = 0;
        while (true) {
            cursorQuery = null;
            if (i >= listM16040K.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList(listM16040K.get(i));
            Collections.sort(arrayList2, f37901a);
            if (arrayList.size() != arrayList2.size()) {
                z = false;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    z = true;
                    break;
                }
                if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new FontsContractCompat(1, null);
        }
        String str2 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str2).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        try {
            cursorQuery = context.getContentResolver().query(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{fontRequest.f37904c}, null, null);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                while (cursorQuery.moveToNext()) {
                    arrayList3.add(new FontsContractCompat2(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0));
                }
            }
            return new FontsContractCompat(0, (FontsContractCompat2[]) arrayList3.toArray(new FontsContractCompat2[0]));
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }
}
