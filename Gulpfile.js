var gulp   = require('gulp')
var concat = require('gulp-concat')
var uglify = require('gulp-uglify')

var js = [
  './node_modules/vanilla-lazyload/dist/vanilla-lazyload.js',
  './_jsc/application.js'
]

gulp.task('jsc', function () {
  return gulp.src(js)
    .pipe(uglify())
    .pipe(concat('application.js'))
    .pipe(gulp.dest('./assets/'))
})

gulp.task('watch', function () {
  gulp.watch('./_jsc/*.js', ['jsc'])
})

gulp.task('default', ['watch'])
