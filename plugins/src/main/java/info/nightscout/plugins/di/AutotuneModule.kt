package info.nightscout.plugins.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import info.nightscout.plugins.general.autotune.AutotuneCore
import info.nightscout.plugins.general.autotune.AutotuneFS
import info.nightscout.plugins.general.autotune.AutotuneFragment
import info.nightscout.plugins.general.autotune.AutotuneIob
import info.nightscout.plugins.general.autotune.AutotunePrep
import info.nightscout.plugins.general.autotune.data.ATProfile
import info.nightscout.plugins.general.autotune.data.BGDatum
import info.nightscout.plugins.general.autotune.data.CRDatum
import info.nightscout.plugins.general.autotune.data.PreppedGlucose

@Module
@Suppress("unused")
abstract class AutotuneModule {
    @ContributesAndroidInjector abstract fun contributesAutotuneFragment(): AutotuneFragment

    @ContributesAndroidInjector abstract fun autoTunePrepInjector(): AutotunePrep
    @ContributesAndroidInjector abstract fun autoTuneIobInjector(): AutotuneIob
    @ContributesAndroidInjector abstract fun autoTuneCoreInjector(): AutotuneCore
    @ContributesAndroidInjector abstract fun autoTuneFSInjector(): AutotuneFS

    @ContributesAndroidInjector abstract fun autoTuneATProfileInjector(): ATProfile
    @ContributesAndroidInjector abstract fun autoTuneBGDatumInjector(): BGDatum
    @ContributesAndroidInjector abstract fun autoTuneCRDatumInjector(): CRDatum
    @ContributesAndroidInjector abstract fun autoTunePreppedGlucoseInjector(): PreppedGlucose
}