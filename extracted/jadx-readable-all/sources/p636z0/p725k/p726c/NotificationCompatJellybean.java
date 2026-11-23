package p636z0.p725k.p726c;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: z0.k.c.s, reason: use source file name */
/* JADX INFO: compiled from: NotificationCompatJellybean.java */
/* JADX INFO: loaded from: classes.dex */
public class NotificationCompatJellybean {

    /* JADX INFO: renamed from: a */
    public static final Object f37786a = new Object();

    /* JADX INFO: renamed from: a */
    public static RemoteInput[] m16125a(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            Bundle bundle = bundleArr[i];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet hashSet = new HashSet();
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
            remoteInputArr[i] = new RemoteInput(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
        }
        return remoteInputArr;
    }

    /* JADX INFO: renamed from: b */
    public static Bundle[] m16126b(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    /* JADX INFO: renamed from: c */
    public static Bundle[] m16127c(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            RemoteInput remoteInput = remoteInputArr[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", remoteInput.f37801a);
            bundle.putCharSequence("label", remoteInput.f37802b);
            bundle.putCharSequenceArray("choices", remoteInput.f37803c);
            bundle.putBoolean("allowFreeFormInput", remoteInput.f37804d);
            bundle.putBundle("extras", remoteInput.f37806f);
            Set<String> set = remoteInput.f37807g;
            if (set != null && !set.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
